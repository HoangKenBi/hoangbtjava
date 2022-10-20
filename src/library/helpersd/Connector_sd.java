package library.helpersd;

import java.sql.*;
import java.util.ArrayList;

public class Connector_sd {

    public final static String connectionString = "jdbc:mysql://localhost:3306/t2203e";
    public final static String user = "root";
    public final static String pwd = ""; // nếu là xampp: "", mamp:"root"

    Connector_sd connsd;

     private static Connector_sd instance;
     private Connector_sd(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection(connectionString,user,pwd);
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
     }

     public static Connector_sd getInstance(){
         if (instance == null){
             instance = new Connector_sd();
         }
         return instance;
     }

    private Statement createStatement() throws Exception{
         return connsd.createStatement();
    }

    public ResultSet query(String sql) {
        try {
            return createStatement().executeQuery(sql);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean executeQuery(String sql){
         try{
             getStatement().execute(sql);
         }catch (Exception e){
             return false;
         }
         return true;
    }

    public PerparedStatement get PreparedStatement(String sql) throws Exception{
         return connsd.preparedStatement(sql);
    }

    public boolean execute(String sql, ArrayList parameters){
        try {
            PreparedStatement pstm = getPreparedStatement(sql);
            for(int i=0;i < parameters.size();i++){
                if(parameters.get(i) instanceof Integer){
                    pstm.setInt(i+1,(Integer)parameters.get(i));
                }else if(parameters.get(i) instanceof Double){
                    pstm.setDouble(i+1,(Double) parameters.get(i));
                }else{
                    pstm.setString(i+1,(String)parameters.get(i));
                }
            }
            pstm.execute();
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public ResultSet executeQuery(String sql, ArrayList parameters){
        try {
            PreparedStatement pstm = getPreparedStatement(sql);
            for(int i=0;i < parameters.size();i++){
                if(parameters.get(i) instanceof Integer){
                    pstm.setInt(i+1,(Integer)parameters.get(i));
                }else if(parameters.get(i) instanceof Double){
                    pstm.setDouble(i+1,(Double) parameters.get(i));
                }else{
                    pstm.setString(i+1,(String)parameters.get(i));
                }
            }
            return pstm.executeQuery();
        }catch (Exception e){
            return null;
        }
    }




}


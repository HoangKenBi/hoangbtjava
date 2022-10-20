package library.student.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import library.Main;
import library.helpersd.Connector_sd;
import library.info.Student;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class StudenController implements Initializable {
    public TableView<Student> tbStudents;
    public TableColumn<Student, Integer> tbIdSd;
    public TableColumn<Student, String> tbNameSd;
    public TableColumn<Student, String> tbEmail;
    public TableColumn<Student, String> tbTel;
/*
    public final static String connectionString = "jdbc:mysql://localhost:3306/t2203e";
    public final static String user = "root";
    public final static String pwd = ""; // nếu là xampp: "", mamp:"root"

 */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbIdSd.setCellValueFactory(new PropertyValueFactory<Student,Integer>("idsd"));
        tbNameSd.setCellValueFactory(new PropertyValueFactory<Student,String>("namesd"));
        tbEmail.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
        tbTel.setCellValueFactory(new PropertyValueFactory<Student,String>("tel"));

        ObservableList<Student> lt = FXCollections.observableArrayList();

        try {
            String sql_txt = "select * from students";
            Connector_sd connsd = Connector_sd.getInstance();
            ResultSet rs = connsd.query(sql_txt);
            while (rs.next()){
                int idsd = rs.getInt("Idsd");

            }
        }
/*
        try {
            String sql_txt = "select * from books";
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.query(sql_txt);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                int qty = rs.getInt("qty");
                Book b = new Book(id,name,author,qty);
                ls.add(b);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            tbBooks.setItems(ls);
        }
 */
    }

    public void createNewStudent(ActionEvent actionEvent) throws Exception{
        Parent listStuden = FXMLLoader.load(getClass().getResource("../create_sd/create_sd.fxml"));
        Main.rootStage.setTitle("Students");
        Main.rootStage.setScene(new Scene(listStuden,800,600));
    }
}

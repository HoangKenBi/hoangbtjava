package library.student.create_sd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import library.Main;
import library.helpersd.Connector_sd;

import java.util.ArrayList;

public class StudentCreateController {
    public TextField txtIdsd;
    public TextField txtNamesd;
    public TextField txtEmail;
    public TextField txtTel;


    public void Add(ActionEvent actionEvent) {
        try{
            Integer idsd = Integer.parseInt(txtIdsd.getText());
            String namesd = txtNamesd.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            String sql_txt = "insert into Students(idsd,namesd,email,tel) values(?,?,?,?)";
            Connector_sd connsd = Connector_sd.getInstance();
            ArrayList arrsd = new ArrayList();
            arrsd.add(idsd);
            arrsd.add(namesd);
            arrsd.add(email);
            arrsd.add(tel);
            if (connsd.execute(sql_txt,arrsd)){
                back();
            }else {
                System.out.println("Error");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void back() throws Exception{
        Parent listStudent = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Main.rootStage.setTitle("Strudents");
        Main.rootStage.setScene(new Scene(listStudent,800,600));
    }
}

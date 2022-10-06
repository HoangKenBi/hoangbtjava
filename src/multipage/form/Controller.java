package multipage.form;

import javafx.PhoneNumber;
import javafx.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import multipage.Main;

import java.awt.*;


public class Controller {

    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;

    public Text errors;

    public ListView<multipage.list.Controller> lv;

   private ObservableList<multipage.list.Controller> List = FXCollections.observableArrayList();
    public void goToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);

        Main.rootStage.setTitle("Danh sách môn học");
        Main.rootStage.setScene(listScene);
    }

    public void add(){
        try {
            errors.setVisible(false);

            if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() ||  txtHours.getText().isEmpty()
            ){
                throw new Exception("Vui lòng nhập các thông tin hợp lệ");
            }
            List.add(new Subjects(txtCode.getText(),txtName.getText(),txtHours.getText()));
            lv.setItems(List);
            lv.refresh();
            clearInput();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }
    }

    public void clearInput(){
        txtCode.setText("");
        txtName.setText("");
        txtHours.setText("");
    }


}

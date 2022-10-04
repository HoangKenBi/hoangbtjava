package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
public class SVController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public ListView<FormSv> lv;
    public Text errors;

    private ObservableList<FormSv> svList = FXCollections.observableArrayList();

    public void addContact(){
        try {
            errors.setVisible(false);
            if(txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtPoint.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên - email và Điểm của sinh viên");
            }
            updatePoint();
            printResult();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }
    }

    public void updatePoint(){
        for(FormSv f:svList){
            if(f.getName().equals(txtName.getText()) && f.getEmail().equals(txtEmail.getText())){
                f.setPoint(txtPoint.getText());
                return;
            }
        }
        svList.add(new FormSv(txtName.getText(),txtEmail.getText(),txtPoint.getText()));
    }
    public void printResult(){
        lv.setItems(svList);
        lv.refresh();
    }

    // nháp sort
    public void sortByName(){

    }





}

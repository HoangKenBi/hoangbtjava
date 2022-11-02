package projectJV2.thanh_vien.create;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import projectJV2.Main;
import projectJV2.dao.implss.TVRepository;
import projectJV2.entities.ThanhVien;

public class CreateTVController {
    public Text txtRole;
    public Text txtSalary;

    public void them(ActionEvent actionEvent) {
        try {
            String role = txtRole.getText();
            Integer salary = Integer.parseInt(txtSalary.getText());
            ThanhVien thanhVien = new ThanhVien(null,role,salary);
            TVRepository rp = new TVRepository();
            if (rp.create(thanhVien)){
                backListTV();
            }else{
                System.out.println("Error");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public void backListTV() throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("../list/thanhvien.fxml"));
        Main.rootStage.setTitle("member");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

package projectJV2.thanh_vien.create;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class CreateTVController {
    public void backListTV(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("../list/thanhvien.fxml"));
        Main.rootStage.setTitle("Thành Viên");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

package projectJV2.thanh_vien.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class ThanhViencontroller {
    public void backToHome4(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/Home.fxml"));
        Main.rootStage.setTitle("Quản Lý Chi Tieu");
        Main.rootStage.setScene(new Scene(listChi,600,400));
    }

    public void addTV(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("../create/createTV.fxml"));
        Main.rootStage.setTitle("Thêm Thành Viên");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

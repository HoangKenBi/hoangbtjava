package projectJV2.thu_nam.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class ThuNamController {
    public void backToHome3(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/Home.fxml"));
        Main.rootStage.setTitle("Quản Lý Chi Tieu");
        Main.rootStage.setScene(new Scene(listChi,600,400));
    }

    public void addThuThang(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/them_thu/themthu.fxml"));
        Main.rootStage.setTitle("Thêm Khoản Thu");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

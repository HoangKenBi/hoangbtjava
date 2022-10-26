package projectJV2.chi_thang.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class ChiThangController {

    public void backToHome2(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/Home.fxml"));
        Main.rootStage.setTitle("Quản Lý Chi Tieu");
        Main.rootStage.setScene(new Scene(listChi,600,400));
    }

    public void addChiThang(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/them_chi/themchithang/themchithang.fxml"));
        Main.rootStage.setTitle("Thêm Khoản Chi");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

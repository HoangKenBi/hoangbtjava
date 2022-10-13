package BTVNJP2.Home;

import BTVNJP2.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
    public void goToQLS(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/BTVNJP2/QLS/table2QLS.fxml"));
        Scene listScene = new Scene(listPage, 600, 500);
        Main.rootStage.setTitle("Quản lý Sách");
        Main.rootStage.setScene(listScene);

    }

    public void goToQLTV(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/BTVNJP2/QLTV/table3QLTV.fxml"));
        Scene listScene = new Scene(listPage, 600, 500);
        Main.rootStage.setTitle("Quản lý Thành Viên");
        Main.rootStage.setScene(listScene);
    }

    public void goToQLMS(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/BTVNJP2/QLMS/table4QLMS.fxml"));
        Scene listScene = new Scene(listPage, 600, 500);
        Main.rootStage.setTitle("Quản lý Mượn Sách");
        Main.rootStage.setScene(listScene);
    }
}

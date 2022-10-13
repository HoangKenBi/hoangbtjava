package BTVNJP2.QLMS;

import BTVNJP2.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
    public void backToHome3(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/BTVNJP2/Home/table1TC.fxml"));
        Scene listScene = new Scene(listPage,600,500);
        Main.rootStage.setTitle("SÁCH");
        Main.rootStage.setScene(listScene);
    }
}

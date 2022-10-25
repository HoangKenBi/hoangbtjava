package projectJV2.Chi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class TongChiController {
    public void goToThem(ActionEvent actionEvent) throws Exception{
        Parent listThemCT = FXMLLoader.load(getClass().getResource("../ThemChiTieu/ThemChiTieu.fxml"));
        Main.rootStage.setTitle("Thêm Chi Tiêu");
        Main.rootStage.setScene(new Scene(listThemCT,800,600));
    }
}

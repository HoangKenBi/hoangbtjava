package projectJV2.them_thu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class ThemThuController {
    public void backToThuThang(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/thu_thang/list/thuthang.fxml"));
        Main.rootStage.setTitle("Thu Tháng");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

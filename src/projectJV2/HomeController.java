package projectJV2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {
    public void goToTongThu(ActionEvent actionEvent) throws Exception{
        Parent listThu = FXMLLoader.load(getClass().getResource("Thu/Tongthu.fxml"));
        Main.rootStage.setTitle("Tổng Thu");
        Main.rootStage.setScene(new Scene(listThu,800,600));
    }

    public void goToTongChi(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("Chi/TongChi.fxml"));
        Main.rootStage.setTitle("Tổng Chi");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}
/*
        Parent listBook = FXMLLoader.load(getClass().getResource("book/list/list.fxml"));
        Main.rootStage.setTitle("Books");
        Main.rootStage.setScene(new Scene(listBook,800,600));
 */
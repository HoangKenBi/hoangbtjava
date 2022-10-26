package projectJV2.them_chi.themchithang;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import projectJV2.Main;

public class ThêmchiThangCotroller {
    public void backToChiThang(ActionEvent actionEvent) throws Exception{
        Parent listChi = FXMLLoader.load(getClass().getResource("/projectJV2/chi_thang/list/chithang.fxml"));
        Main.rootStage.setTitle("Chi Tháng");
        Main.rootStage.setScene(new Scene(listChi,800,600));
    }
}

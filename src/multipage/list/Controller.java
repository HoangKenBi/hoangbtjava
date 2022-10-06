package multipage.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import multipage.Main;

import java.io.IOException;
import java.util.Objects;

public class Controller {

    public ListView<Controller> lv;

    private ObservableList<Controller> List = FXCollections.observableArrayList();
    public void goToForm(ActionEvent actionEvent) throws IOException {
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        //Stage newStage = new Stage();
        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);
    }


}

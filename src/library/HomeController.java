package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class HomeController {

    public void goToBookList(ActionEvent actionEvent) throws Exception {
        Parent listBook = FXMLLoader.load(getClass().getResource("book/list/list.fxml"));
        Main.rootStage.setTitle("Books");
        Main.rootStage.setScene(new Scene(listBook,800,600));
    }

/*    public void goToStudentList(ActionEvent actionEvent) throws IOException {
        Parent listStudent = FXMLLoader.load(getClass().getResource("student/list/list.fxml"));
        Main.rootStage.setTitle("Students");
        Main.rootStage.setScene(new Scene(listStudent,800,600));
    }

 */

    public void goToRents(ActionEvent actionEvent) throws Exception{
        Parent listBook = FXMLLoader.load(getClass().getResource("bookrent/create/create.fxml"));
        Main.rootStage.setTitle("Books rent");
        Main.rootStage.setScene(new Scene(listBook,800,600));
    }
}

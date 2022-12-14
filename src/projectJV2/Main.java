package projectJV2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import projectJV2.them_chi.themchithang.ThemchiThangCotroller;


public class Main extends Application {
    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("Quản Lý Chi Tiêu");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);


    }
}

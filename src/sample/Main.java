package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("Chessboard.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Chess");
        primaryStage.setScene(new Scene(root, 670, 670));
        primaryStage.show();*/

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Connection");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

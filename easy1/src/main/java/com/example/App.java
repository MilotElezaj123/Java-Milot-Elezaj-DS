package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage)  {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/layout.fxml"));

            Scene scene = new Scene(root,400,300 );

            primaryStage.setTitle("Shembulli i JavaFX");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
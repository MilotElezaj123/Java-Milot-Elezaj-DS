package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage){
    try{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/Sample.fxml"));
       Scene scene = new Scene(loader.load(),400,400);
       primaryStage.setTitle("FXML ne Java");
    } catch (Exception e){
     e.printStackTrace();
    }   
    }
    public static void main(String[] args) {
        launch();
    }

}
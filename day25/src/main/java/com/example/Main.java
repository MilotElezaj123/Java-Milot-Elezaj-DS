package com.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        Login loginPage = new Login(primaryStage);
        primaryStage.setTitle("Detyra - 4.11.2024");
        primaryStage.setScene(loginPage.getScene());
        primaryStage.show();
    }
    public static void main(String []args){
        launch(args);
    }
}

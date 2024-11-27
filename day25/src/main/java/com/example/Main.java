package com.example;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        Dashboard dashboardPage = new Dashboard(primaryStage);
        Login loginPage = new Login(primaryStage);
        Signup signupPage = new Signup(primaryStage);
        primaryStage.setTitle("Detyra - 4.11.2024");
        primaryStage.setScene(loginPage.getScene());
        primaryStage.setScene(signupPage.getScene());
        primaryStage.show();
    }
    public static void main(String []args){
        launch(args);
    }
}

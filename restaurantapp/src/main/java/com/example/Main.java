package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Ngarkoni FXML nga skedari
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/restaurant.fxml"));
            AnchorPane root = loader.load();

            // Vendosni skenën dhe titullin
            Scene scene = new Scene(root);
            primaryStage.setTitle("Restaurant Menu");
            primaryStage.setScene(scene);

            // Shfaqni dritaren kryesore
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

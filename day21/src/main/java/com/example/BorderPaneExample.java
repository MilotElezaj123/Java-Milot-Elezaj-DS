package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.layout.BorderPane;

import javafc.scene
import java.io.IOException;

/**
 * JavaFX App
 */
public class BorderPaneExample extends Application {

    @Override
    public void start(){
        BorderPane borderpane = new BorderPane();


        Scene scene = new Scene(borderpane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Miloti o Albert Ajnshtajni ");
        stage.show();
    }    
    public static void main(String[] args) {
        launch();
    }

}
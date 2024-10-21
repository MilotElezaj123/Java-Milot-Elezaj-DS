package com.example;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;


/**
 * JavaFX App
 */
public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage){
        BorderPane borderpane = new BorderPane();

        HBox topMenu = new HBox (new Button("Shtepi"), new Button("Settingsa"));
        topMenu.setSpacing(20);
        
        VBox leftMenu = new VBox(new Button("Opsioni 1"), new Button("Opsioni 2"));
        leftMenu.setSpacing(20);
        
        
        borderpane.setTop(topMenu);
        borderpane.setLeft(leftMenu);

        Scene scene = new Scene(borderpane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Miloti o Albert Ajnshtajni ");
        stage.show();
    }    
    public static void main(String[] args) {
        launch();
    }

}
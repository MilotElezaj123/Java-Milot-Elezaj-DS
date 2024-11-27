package com.example;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Dashboard {
    private Scene scene;

    public Dashboard(Stage primaryStage){
        BorderPane layout = new BorderPane();

        Label title = new Label("Mire se vini tek Dashboard");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        BorderPane.setMargin(layout, new Insets(10,0,10,0));
        layout.setTop(title);

        scene = new Scene(layout, 400,300);
    }
    public Scene getScene(){
        return scene;
    }
}

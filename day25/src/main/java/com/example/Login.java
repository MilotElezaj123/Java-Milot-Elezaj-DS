package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Login {

    private Scene scene;
    public Login(Stage primaryStage){
    BorderPane layout = new BorderPane();
    Label title = new Label("Faqja e Kycjes");
    title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
    BorderPane.setMargin(title, new Insets(10,0,10,0));
    layout.setTop(title);

    Label labelEmri = new Label("Emri juaj");
    TextField textFieldEmri = new TextField();

    Label labelFjalekalimi = new Label("Fjalekalimi juaj");
    PasswordField Fjalekalimi = new PasswordField();
    VBox fields = new VBox(10,labelEmri,textFieldEmri,labelFjalekalimi,Fjalekalimi);
    fields.setPadding(new Insets(20,20,20,20));
    layout.setCenter(fields);

    Label error = new Label();
    error.setStyle("-fx-text-fill : red;");

    Button buttonLogin = new Button("Kyçuni");
    buttonLogin.setStyle("-fx-background-color: #4CAF50, -fx-text-fill :white; -fx-font-size: 14px; -fx-border-radius: 5px; -fx-background-radius: 5px");
    buttonLogin.setOnAction(e ->{
        String username = textFieldEmri.getText();
        String password = Fjalekalimi.getText();
        if(username.isEmpty() || password.isEmpty()){
            error.setText("Mbushi kriteret");
           
        } else {
            Dashboard dashboard = new Dashboard(primaryStage);
            primaryStage.setScene(dashboard.getScene());
        }
    });

    Button buttonRegjistrimi = new Button("Shkoni tek Regjistrohuni");
    buttonRegjistrimi.setStyle("-fx-background-color: #2196F3; -fx-textfill: white; -fx-font-size: 14px; -fx-border-radius: 5px; -fx-background-radius: 5px;");
    buttonRegjistrimi.setOnAction(e ->{
        Signup faqjaRegjistrimit = new Signup(primaryStage);
        primaryStage.setScene(faqjaRegjistrimit.getScene());

    });
    HBox buttonBox = new HBox(10,buttonLogin,buttonRegjistrimi);
    buttonBox.setPadding(new Insets(10,20,10,20));
    layout.setBottom(buttonBox);

    scene = new Scene(layout, 350 , 300);
    
    }
public Scene getScene(){
    return scene;
}
}
    

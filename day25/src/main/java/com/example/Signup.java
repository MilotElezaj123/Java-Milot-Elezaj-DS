package com.example;

import java.time.format.TextStyle;

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


public class Signup {
private Scene scene;
    public Signup(Stage primaryStage) {
        BorderPane layout = new BorderPane();

        Label titulli = new Label("Faqja e regjistrimit");
        titulli.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        BorderPane.setMargin(titulli, new Insets(10,0,10,0));
        layout.setTop(titulli);

        Label emri = new Label("Emri:");
        TextField tekstiemri = new TextField();

        Label Fjalekalimi = new Label("Fjalekalimi:");
        TextField tekstifjalekalimi = new TextField();

        Label KonfirmoFjalekalimin = new Label("Konfirmo Fjalekalimin:");
        TextField tekstikonfirmofjalekalimin = new TextField();

        VBox fields = new VBox(10,emri,tekstiemri,Fjalekalimi,tekstifjalekalimi,KonfirmoFjalekalimin,tekstikonfirmofjalekalimin);
        fields.setPadding(new Insets(20,20,20,20));
        layout.setCenter(fields);
        Label error = new Label();
        error.setStyle("-fx-text-fill : red;");
    

        Button buttonRegjistrimi = new Button("Regjistronu");
        buttonRegjistrimi.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-border-radius: 5px; -fx-background-radius: 5px");
        buttonRegjistrimi.setOnAction(e -> {
          String username = tekstiemri.getText();
          String password = tekstifjalekalimi.getText();
          String confirmpassword = tekstikonfirmofjalekalimin.getText();

          if(username.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()){
             error.setText("Permbushi te gjitha");
          }else if(!password.equals(confirmpassword)){
            error.setText("Passwordi nuk eshte i ngjashem");
          }else{
            Dashboard dashboard = new  Dashboard(primaryStage);
            primaryStage.setScene(dashboard.getScene());
          }
        });

        Button buttonperseriLogin = new Button("Regjistronu");
        buttonperseriLogin.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-border-radius: 5px; -fx-background-radius: 5px");
        buttonperseriLogin.setOnAction(e -> {
          Login faqjaLogin = new Login(primaryStage);
          primaryStage.setScene(faqjaLogin.getScene());
        });

        HBox buttonBox = new HBox(10,buttonRegjistrimi,buttonperseriLogin);
        buttonBox.setPadding(new Insets(10,20,10,20));
        buttonBox.setSpacing(20);
        buttonBox.setStyle("-fx-alignment: center");
        layout.setBottom(buttonBox);

        scene = new Scene(layout,350,350);
    }

    public Scene getScene() {
        return scene;
    }
    
}

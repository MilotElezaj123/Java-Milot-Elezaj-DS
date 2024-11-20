package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class SampleClass {

    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private void handleButtonClick(){
        label1.setText("Ju klikuat butonin");

        button1.setText("Klikuar");
        System.out.println("Buttoni 1 eshte klikuar");
    }
}

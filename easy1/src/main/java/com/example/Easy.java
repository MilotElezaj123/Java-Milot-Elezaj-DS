package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Easy {

    @FXML 
    private Label label;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
        assert label != null : "/fx:id\"label\" was not injected: check your FXML file 'easy1.fxml'.";
    }

}

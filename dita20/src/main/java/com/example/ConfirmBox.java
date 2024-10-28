
package com.example;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // Block interaction with other windows
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(message);

        // Yes button
        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close(); // Close the ConfirmBox window
        });

        // No button
        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            answer = false;
            window.close(); // Close the ConfirmBox window
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); // Wait for the user to take action

        return answer; // Return the user's choice
    }
}

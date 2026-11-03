package com.larsen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label title = new Label("PlateCost");

        TextField nameField = new TextField();
        nameField.setPromptText("Ingredient name");

        TextField costField = new TextField();
        costField.setPromptText("Cost per unit");

        TextField quantityField = new TextField();
        quantityField.setPromptText("Units used");

        Button addButton = new Button("Add");

        HBox inputRow = new HBox(8, nameField, costField, quantityField, addButton);
        inputRow.setStyle("-fx-border-color: black;");

        VBox root = new VBox(title, inputRow);
        Scene scene = new Scene(root, 800, 400);

        primaryStage.setTitle("Plate Cost");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

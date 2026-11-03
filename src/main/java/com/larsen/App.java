package com.larsen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class App extends Application {
    private final Label totalLabel = new Label("Total place cost: $0.00");

    @Override
    public void start(Stage primaryStage) {
        Label title = new Label("PlateCost");
        title.setStyle("-fx-font-size: 30px; -fx-font-weight: bold");
        title.setMaxWidth(Double.MAX_VALUE);
        title.setAlignment(Pos.CENTER);

        Label IngredientLabel = new Label("Add an Ingredient");

        TextField nameField = new TextField();
        nameField.setPromptText("Ingredient name");

        TextField costField = new TextField();
        costField.setPromptText("Cost $");
        costField.setPrefWidth(70);

        TextField quantityField = new TextField();
        quantityField.setPromptText("Units used");
        quantityField.setPrefWidth(70);

        Button addButton = new Button("Add");

        HBox inputRow = new HBox(8, IngredientLabel, nameField, costField, quantityField, addButton);
        // inputRow.setStyle("-fx-border-color: black;");

        Button removeButton = new Button("Remove Selected");

        HBox bottomRow = new HBox(10, removeButton, totalLabel);

        VBox root = new VBox(title, inputRow, bottomRow);
        Scene scene = new Scene(root, 800, 400);

        primaryStage.setTitle("Plate Cost");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

package com.example.designpattern;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // UI Elements
        Label titleLabel = new Label("Login Page - Your Name");
        titleLabel.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        Button loginButton = new Button("Login");
        Label messageLabel = new Label();

        // Controller Setup
        LoginController controller = new LoginController(usernameField, passwordField, messageLabel);
        loginButton.setOnAction(e -> controller.handleLogin());

        VBox root = new VBox(10, titleLabel, usernameField, passwordField, loginButton, messageLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        primaryStage.setTitle("Login Page - Your Name");
        primaryStage.setScene(new Scene(root, 350, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
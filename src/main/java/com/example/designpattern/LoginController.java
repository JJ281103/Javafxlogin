package com.example.designpattern;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {

    private static final String USERNAME = "Jesbin";
    private static final String PASSWORD = "54321";
    private int failedAttempts = 0;

    @FXML
    private final TextField usernameField;
    @FXML
    private final PasswordField passwordField;
    @FXML
    private final Label messageLabel;

    public LoginController(TextField usernameField, PasswordField passwordField, Label messageLabel) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.messageLabel = messageLabel;
    }

    public void handleLogin() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please Provide Username or Password.");
            return;
        }

        if (failedAttempts >= 5) {
            messageLabel.setText("Sorry, Your Account is Locked!!!");
            return;
        }

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            messageLabel.setText("Success!!!");
            failedAttempts = 0; // Reset after success
        } else {
            failedAttempts++;
            messageLabel.setText(failedAttempts >= 5 ? "Sorry, Your Account is Locked!!!" : "Sorry, Invalid Username or Password.");
        }
    }
}

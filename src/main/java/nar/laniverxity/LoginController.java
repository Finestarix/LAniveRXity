package nar.laniverxity;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label lblErrorMessage;

    @FXML
    private TextField tfEmailAddress;

    @FXML
    private TextField tfPassword;

    @FXML
    private void loginAction() {
        String emailAddress = tfEmailAddress.getText();
        String password = tfPassword.getText();

        if (emailAddress.isEmpty()) {
            lblErrorMessage.setText("Email address cannot be null or empty.");
        } else if (password.isEmpty()) {
            lblErrorMessage.setText("Password cannot be null or empty.");
        } else {
            lblErrorMessage.setText("");
        }
    }
}
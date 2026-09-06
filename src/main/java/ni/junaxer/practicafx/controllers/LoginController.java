package ni.junaxer.practicafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import ni.junaxer.practicafx.components.CustomInput;
import ni.junaxer.practicafx.utils.AlertUtils;

public class LoginController {

    @FXML
    private CustomInput inputUser;
    @FXML
    private CustomInput inputPassword;


    @FXML
    protected void btnLogin() {
        String user = inputUser.getText().trim();
        String password = inputPassword.getText().trim();

        if (user.isEmpty() || password.isEmpty()) {
            AlertUtils.showWarning(Alert.AlertType.INFORMATION, "Campos incompletos", "Por favor, ingresa tu usuario y contraseña.");
            return;
        }
        if (user.equalsIgnoreCase("admin") && password.equals("qwerty123")) {

            AlertUtils.showWarning(Alert.AlertType.INFORMATION, "Bienvenido", "¡Inicio de sesión exitoso!");

        } else {
            AlertUtils.showWarning(Alert.AlertType.ERROR, "Acceso denegado", "Usuario o contraseña incorrectos.");
        }
    }
}

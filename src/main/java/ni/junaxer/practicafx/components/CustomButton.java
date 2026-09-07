package ni.junaxer.practicafx.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ni.junaxer.practicafx.utils.AlertUtils;

import java.io.IOException;
import java.util.Objects;

public class CustomButton extends Button {

    @FXML
    private ImageView img;

    private String iconoUrl;


    public CustomButton() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom-button.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setIconUrl(String rutaImagen) {
        this.iconoUrl = rutaImagen;
        try {
            Image imagen = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rutaImagen)));
            img.setImage(imagen);
        } catch (Exception e) {
            AlertUtils.showWarning(Alert.AlertType.WARNING, "Ruta Invalida", "No se encontró la imagen en la ruta: " + rutaImagen);
        }
    }

    public String getIconUrl() {
        return iconoUrl;
    }


}

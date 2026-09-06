package ni.junaxer.practicafx.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import java.io.IOException;

public class SceneNavigator {

    public static void cambiarPantalla(Node nodoActual, String rutaFxml) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SceneNavigator.class.getResource(rutaFxml));
            Parent nuevaRaiz = fxmlLoader.load();

            Scene escenaActual = nodoActual.getScene();
            escenaActual.setRoot(nuevaRaiz);

        } catch (IOException exception) {
            AlertUtils.showWarning(Alert.AlertType.WARNING, "Error de navegacioón", "No se pudo cargar la pantalla " + rutaFxml);
        }

    }
}

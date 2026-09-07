package ni.junaxer.practicafx.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CustomSeparator extends VBox {

    @FXML
    private Label lblTitle;

    public CustomSeparator() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom-separator.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setTitle(String texto) {
        lblTitle.setText(texto);
    }

    public String getTitle() {
        return lblTitle.getText();
    }
}

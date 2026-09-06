package ni.junaxer.practicafx.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CustomInput extends VBox {

    @FXML
    private Label lblTitle;
    @FXML
    private TextField txtInput;
    @FXML
    private PasswordField txtPassword;

    private boolean isPassword = false;

    public CustomInput() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom-input.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setIsPassword(boolean value) {
        this.isPassword = value;
        txtInput.setVisible(!value);
        txtPassword.setVisible(value);
    }
    public boolean getIsPassword() { return isPassword; }

    public void setLabelText(String value) { lblTitle.setText(value);}
    public String getLabelText() {return lblTitle.getText();}

    public void setPromptText(String value){
        txtInput.setPromptText(value);
        txtPassword.setPromptText(value);
    }
    public String getPromptText(){ return txtInput.getPromptText();}

    public TextField getTextFieldText() { return txtInput;}
    
    public String getText() {
        if (getIsPassword()) {
            return txtPassword.getText();
        }
        return txtInput.getText(); 
    }
}

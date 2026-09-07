package ni.junaxer.practicafx.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("/ni/junaxer/practicafx/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 500);
        Image icon = new Image(Objects.requireNonNull(LoginApplication.class.getResourceAsStream("/ni/junaxer/practicafx/iconos/logo.png")));
        stage.getIcons().add(icon);
        stage.setTitle("BizLinker");
        stage.setScene(scene);
        stage.show();
    }

}


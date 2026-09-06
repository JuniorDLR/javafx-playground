module ni.junaxer.practicafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.junaxer.practicafx to javafx.fxml;
    exports ni.junaxer.practicafx;
    
    opens ni.junaxer.practicafx.controllers to javafx.fxml;
    exports ni.junaxer.practicafx.controllers;

    opens ni.junaxer.practicafx.components to javafx.fxml;
    exports ni.junaxer.practicafx.components;
    
    exports ni.junaxer.practicafx.app;
}
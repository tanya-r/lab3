package lab3.ex2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab3Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    @FXML
    private TextField textField1;

    @FXML
    void buttonPressed(ActionEvent event) {
    	label1.setText(textField1.getText());
    }

    @FXML
    void initialize() {
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'ui.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'ui.fxml'.";
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'ui.fxml'.";

    }
}

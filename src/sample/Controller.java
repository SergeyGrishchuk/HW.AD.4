package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea messageField;
    @FXML
    public TextField textField;
    @FXML
    public void onClickText() {
        messageField.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }
    @FXML
    public void onClick() {
        messageField.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }
}

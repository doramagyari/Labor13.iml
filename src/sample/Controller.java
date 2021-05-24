package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public void refresh(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        button.setText("I have been pressed");
    }
}

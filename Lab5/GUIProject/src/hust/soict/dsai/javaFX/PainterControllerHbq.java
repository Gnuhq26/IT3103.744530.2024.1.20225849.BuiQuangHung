package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterControllerHbq {
    private Color pen;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(),event.getY(),4, pen);
    	drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void penModeActivated(ActionEvent event) {
        pen = Color.BLACK;
    }

    @FXML
    void eraserModeActivated(ActionEvent event) {
        pen = Color.WHITE;
    }
}


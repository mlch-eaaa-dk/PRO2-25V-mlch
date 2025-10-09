package demoinnerclass;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

    public void start(Stage stage) {
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        pane.setAlignment(Pos.CENTER);

        stage.setTitle("Demo Inner class");
        stage.setScene(scene);
        stage.show();
    }

    private final Label lblText = new Label("UP");

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setMinWidth(200);
        pane.setPadding(new Insets(20));
        pane.setVgap(20);

        pane.add(lblText, 0, 0);
        GridPane.setHalignment(lblText, HPos.CENTER);

        Button btnUpDown = new Button("Up - Down");
        pane.add(btnUpDown, 0, 1);

        // Local class (inner class in a method)
//        class UpDownEventHandler implements EventHandler<ActionEvent> {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                if (lblText.getText().equals("UP")) lblText.setText("DOWN");
//                else lblText.setText("UP");
//            }
//        }
//        EventHandler<ActionEvent> handler = new UpDownEventHandler();
//        btnUpDown.setOnAction(handler);

        // Anonymous class
//        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                if (lblText.getText().equals("UP")) lblText.setText("DOWN");
//                else lblText.setText("UP");
//            }
//        };
//        btnUpDown.setOnAction(handler);

        // Lambda expression
//        EventHandler<ActionEvent> handler = (ActionEvent event) -> {
//            if (lblText.getText().equals("UP")) lblText.setText("DOWN");
//            else lblText.setText("UP");
//        };
//        btnUpDown.setOnAction(handler);

//        EventHandler<ActionEvent> handler = (ActionEvent event) -> upDownAction();
//        btnUpDown.setOnAction(handler);

        btnUpDown.setOnAction(event -> upDownAction());
    }

    private void upDownAction() {
        if (lblText.getText().equals("UP")) lblText.setText("DOWN");
        else lblText.setText("UP");
    }
}

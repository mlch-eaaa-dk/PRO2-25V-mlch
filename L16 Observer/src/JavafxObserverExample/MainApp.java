package JavafxObserverExample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Page 65-67 in the book with JavaFX (the book uses Swing)
public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Angel listener - Devil listener");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(100));

        Button btn = new Button("Should I do it?");
        pane.add(btn, 0, 0);

        btn.addEventHandler(ActionEvent.ACTION, new AngelListener());
        btn.addEventHandler(ActionEvent.ACTION, new DevelListener());

//        // Using lambda:
//        btn.addEventHandler(ActionEvent.ACTION, event ->
//                System.out.println("Angel: Don't do it, you might regret it!"));
//        btn.addEventHandler(ActionEvent.ACTION, event ->
//                System.out.println("Devil: Come on, do it!"));
    }

    static class AngelListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Angel: Don't do it, you might regret it!");
        }
    }

    static class DevelListener implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Devil: Come on, do it!");
        }
    }
}

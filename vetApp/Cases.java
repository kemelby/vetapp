package vetApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Cases extends Application {

	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Initialize components
        PriorityQueuePane priorityQueuePane = new PriorityQueuePane();
        MessageRotationPane messageRotationPane = new MessageRotationPane();
        StackPane stackPane = new StackPane();

        // Set up the layout
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(stackPane);
        borderPane.setRight(priorityQueuePane);
        borderPane.setBottom(messageRotationPane);

        // Create the scene
        Scene scene = new Scene(borderPane, 800, 600);

        // Set up the stage
        primaryStage.setTitle("Vet Office App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
package vetApp;

import java.util.Stack;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

class StackPane extends VBox {
	 public StackPane() {
	        ListView<String> stackListView = new ListView<>();
	        Button pushButton = new Button("Push Task");
	        Button popButton = new Button("Pop Task");

	        getChildren().addAll(stackListView, pushButton, popButton);
	        setSpacing(10);
	        setAlignment(Pos.CENTER);
	    }
	}
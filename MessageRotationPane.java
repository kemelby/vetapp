package vetApp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

class MessageRotationPane extends HBox {
	 public MessageRotationPane() {
	        Label messageLabel = new Label();
	        Button addButton = new Button("Add Message");
	        Button removeButton = new Button("Remove Message");

	        getChildren().addAll(messageLabel, addButton, removeButton);
	        setSpacing(10);
	        setAlignment(Pos.CENTER);
	    }
	}
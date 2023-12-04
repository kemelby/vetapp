package vetApp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

class MessageRotationPane extends HBox {
    private CircularLinkedList<String> messageList;
    private Label messageLabel;

    public MessageRotationPane() {
        messageList = new CircularLinkedList<>();

        messageLabel = new Label();
        Button addButton = new Button("Add Message");
        Button removeButton = new Button("Remove Message");

        addButton.setOnAction(event -> {
        	
        }
}
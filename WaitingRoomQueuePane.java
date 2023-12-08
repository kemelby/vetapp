package vetApp;

import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class WaitingRoomQueuePane extends VBox implements EventHandler<ActionEvent> {
	private Button removeButton;
	private Button addButton;
	private TextField qNewTaskTF;
	private Label nextUp;
	WaitingRoomQueue wrmQ = new WaitingRoomQueue();
	public WaitingRoomQueuePane() {
        removeButton = new Button("Take Next Patient");
        qNewTaskTF = new TextField();
        addButton = new Button("Add Person");
        nextUp = new Label("My Veterinarian Office");
        removeButton.setOnAction(this);
        addButton.setOnAction(this);

        getChildren().addAll(nextUp, qNewTaskTF, addButton, removeButton);
        setSpacing(10);
        setAlignment(Pos.CENTER);
        nextUp.setStyle("-fx-font-weight: bold");
        
    }
	public void handle(ActionEvent e) {
		if(e.getSource() == addButton) {
			if(qNewTaskTF.getText().equals("")) {
				System.out.println("Do Nothing");
			}
			else {
				wrmQ.addToQueue(qNewTaskTF.getText());
				clear();
				System.out.println(wrmQ.viewTopQ());
				nextUp.setText("My Veterinarian Office: Next Patient - " + wrmQ.viewTopQ());
			}
		}
		if (e.getSource() == removeButton) {
			wrmQ.rmFromQueue();
			System.out.println(wrmQ.viewTopQ());
			nextUp.setText("My Veterinarian Office: Next Patient - " + wrmQ.viewTopQ());
		}
	}
	
	protected void clear() {
		qNewTaskTF.setText("");
	}
}



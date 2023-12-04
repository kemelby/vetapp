package vetApp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

class PriorityQueuePane extends VBox {
	public PriorityQueuePane() {
        ListView<String> taskListView = new ListView<>();
        Button addButton = new Button("Add Task");
        Button removeButton = new Button("Remove Task");

        getChildren().addAll(taskListView, addButton, removeButton);
        setSpacing(10);
        setAlignment(Pos.CENTER);
    }
}

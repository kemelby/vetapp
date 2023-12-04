package vetApp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

class PriorityQueuePane extends VBox {
	private MinHeap<Task> taskMinHeap;
	private ListView<String> taskListView;

	public PriorityQueuePane() {
        taskMinHeap = new MinHeap<>();

        taskListView = new ListView<>();
        Button addButton = new Button("Add Task");
        Button removeButton = new Button("Remove Task");

        addButton.setOnAction(event -> {
        }
        }
}

package vetApp;

import java.util.Stack;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

class StackPane extends VBox {
    private Stack<Task> taskStack;
    private ListView<String> stackListView;

    public StackPane() {
        taskStack = new Stack<>();
    }
}

import java.util.function.ObjDoubleConsumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoController {
    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    public void addTask(String name) {
        Task task = new Task(name);
        tasks.add();
    }

    public void removeTask(String name) {
        tasks.remove(name);
    }

    public void markCompleted(Task task, boolean completed) {
        tasks.setCompleted(completed);
    }

    public ObservableList<Tasks> getTasks() {
        return tasks;
    }
}
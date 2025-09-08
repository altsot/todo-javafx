import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoController {
    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    public void addTask(String name) {
        Task task = new Task(name);
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void markCompleted(Task task, boolean completed) {
        task.setCompleted(completed);
    }

    public ObservableList<Task> getTasks() {
        return tasks;
    }
}
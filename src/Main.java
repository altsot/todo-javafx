import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Main extends Application {

    private TodoController controller = new TodoController();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("To-do List");

        ListView<Task> listView = new ListView<>();
        listView.setItems(controller.getTasks());

        listView.setCellFactory(lv -> new ListCell<>() {
            private CheckBox checkBox = new CheckBox();

            {
                checkBox.setOnAction(e -> {
                    Task task = getItem();
                    if (task != null) {
                        controller.markCompleted(task, checkBox.isSelected());
                    }
                });
            }

            @Override
            protected void updateItem(Task task, boolean empty) {
                super.updateItem(task, empty);
                if (empty || task == null) {
                    setGraphic(null);
                    setText(null);
                } else {
                    checkBox.setText(task.getName());
                    checkBox.setSelected(task.isCompleted());
                    setGraphic(checkBox);
                }
            }
        });

        TextField input = new TextField();
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            String name = input.getText().trim();
            if (!name.isEmpty()) {
                controller.addTask(name);
                input.clear();
            }
        });

        Button removeButton = new Button("Remove");
        removeButton.setOnAction(e -> {
            Task selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                controller.removeTask(selected);
            }
        });

        HBox inputBox = new HBox(5, input, addButton, removeButton);
        VBox root = new VBox(10, listView, inputBox);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
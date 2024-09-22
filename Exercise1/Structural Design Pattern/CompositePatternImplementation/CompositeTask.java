import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public CompositeTask(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void execute() {
        System.out.println("Executing composite task: " + name);
        for (Task task : tasks) {
            task.execute();
        }
    }
}

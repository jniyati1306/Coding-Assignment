import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        if (!isValidTime(task.getStartTime()) || !isValidTime(task.getEndTime())) {
            System.out.println("Error: Invalid time format.");
            return;
        }

        for (Task existingTask : tasks) {
            if (existingTask.overlapsWith(task)) {
                System.out.println("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
                return;
            }
        }

        tasks.add(task);
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasks.remove(task);
                System.out.println("Task removed successfully.");
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }

        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        System.out.println("Scheduled tasks:");
        for (Task task : tasks) {
            System.out.println(task.getDescription() + " [" + task.getPriority() + "] from " + task.getStartTime() + " to " + task.getEndTime());
        }
    }

    private boolean isValidTime(String time) {
        String regex = "([01]?\\d|2[0-3]):([0-5]\\d)";
        return time.matches(regex);
    }
}

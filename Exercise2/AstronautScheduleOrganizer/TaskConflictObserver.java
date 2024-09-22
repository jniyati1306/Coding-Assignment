public class TaskConflictObserver {
    public void notifyConflict(Task task) {
        System.out.println("Error: Task conflicts with existing tasks.");
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleTask task1 = new SimpleTask("Task 1");
        SimpleTask task2 = new SimpleTask("Task 2");
        
        CompositeTask compositeTask = new CompositeTask("Composite Task");
        compositeTask.addTask(task1);
        compositeTask.addTask(task2);
        
        compositeTask.execute();
    }
}


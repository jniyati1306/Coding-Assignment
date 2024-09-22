import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager scheduleManager = ScheduleManager.getInstance();

        System.out.println("Welcome to the Astronaut Daily Schedule Organizer!");
        String command;
        do {
            System.out.print("Enter a command (add, view, remove, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:MM): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:MM): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    scheduleManager.addTask(new Task(description, startTime, endTime, priority));
                    break;

                case "view":
                    scheduleManager.viewTasks();
                    break;

                case "remove":
                    System.out.print("Enter task description to remove: ");
                    String taskToRemove = scanner.nextLine();
                    scheduleManager.removeTask(taskToRemove);
                    break;

                case "exit":
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Unknown command. Please try again.");
                    break;
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}

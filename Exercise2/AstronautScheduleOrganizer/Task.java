public class Task {
    private String description;
    private String startTime; // Format: HH:MM
    private String endTime; // Format: HH:MM
    private String priority;

    public Task(String description, String startTime, String endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() { // Add this method
        return priority;
    }

    public boolean overlapsWith(Task other) {
        return (this.startTime.compareTo(other.endTime) < 0 && this.endTime.compareTo(other.startTime) > 0);
    }
}

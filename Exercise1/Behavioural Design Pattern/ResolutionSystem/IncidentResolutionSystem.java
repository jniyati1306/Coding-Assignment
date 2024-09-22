// IncidentResolutionSystem.java
public class IncidentResolutionSystem {

    public static void main(String[] args) {
        // Create the handlers
        Handler level1 = new Level1Handler();
        Handler level2 = new Level2Handler();
        Handler level3 = new Level3Handler();

        // Set the chain of responsibility
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        try {
            // Test various issues
            LoggerUtil.log("Testing a basic issue:");
            level1.handleRequest("basic");

            LoggerUtil.log("\nTesting a complex issue:");
            level1.handleRequest("complex");

            LoggerUtil.log("\nTesting a critical issue:");
            level1.handleRequest("critical");

            LoggerUtil.log("\nTesting an unknown issue:");
            level1.handleRequest("unknown");
        } catch (Exception e) {
            LoggerUtil.logError("An error occurred in the incident resolution system: " + e.getMessage());
        }
    }
}

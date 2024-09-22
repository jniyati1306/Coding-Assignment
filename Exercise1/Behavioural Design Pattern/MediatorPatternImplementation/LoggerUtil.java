
public class LoggerUtil {
    private static LoggerUtil instance;

    private LoggerUtil() {
        // Private constructor to prevent instantiation
    }

    public static LoggerUtil getInstance() {
        if (instance == null) {
            instance = new LoggerUtil();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}

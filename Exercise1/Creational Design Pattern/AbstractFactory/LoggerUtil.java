import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {
    private static LoggerUtil instance;
    private Logger logger;

    private LoggerUtil() {
        logger = Logger.getLogger(LoggerUtil.class.getName());
    }

    public static LoggerUtil getInstance() {
        if (instance == null) {
            instance = new LoggerUtil();
        }
        return instance;
    }

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
}

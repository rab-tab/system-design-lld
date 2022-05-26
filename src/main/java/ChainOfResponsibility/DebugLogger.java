package ChainOfResponsibility;

public class DebugLogger extends Logger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level == level) {
            //handle request
            System.out.println("DebugLogger handling level " + level);
        } else {
            //pass to next logger
            nextLogger.logMessage(level, message);

        }

    }
}

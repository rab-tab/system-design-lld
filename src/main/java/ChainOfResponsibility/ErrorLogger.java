package ChainOfResponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
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

package ChainOfResponsibility.approach2;

public class infoLogger extends Logger {

    public infoLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level == level) {
            //handle request
            System.out.println("infoLogger handling level " + level);
        } else {
            //pass to next logger
            nextLogger.logMessage(level, message);

        }

    }
}

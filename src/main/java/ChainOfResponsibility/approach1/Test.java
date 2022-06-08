package ChainOfResponsibility.approach1;

public class Test {
    public static void main(String[] args) {
        Logger logger = getLogger();
        logger.logMessage(Logger.INFO,"info level message");
        logger.logMessage(Logger.DEBUG,"DEBUG level message");
        logger.logMessage(Logger.ERROR,"ERROR level message");

    }

    public static Logger getLogger() {
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        infoLogger.setNextLogger(debugLogger);

        Logger errorLogger = new test.ErrorLogger(Logger.ERROR);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}

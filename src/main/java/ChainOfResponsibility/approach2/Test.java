package ChainOfResponsibility.approach2;

public class Test {
    public static void main(String[] args) {
        Logger logger = getLogger();
        logger.logMessage(Logger.DEBUG, "debug message");
        logger.logMessage(Logger.INFO, "info message");
        logger.logMessage(Logger.ERROR, "error message");
    }

    private static Logger getLogger() {

        Logger debugLogger=new DebugLogger(Logger.DEBUG);
        Logger infoLogger=new infoLogger(Logger.INFO);
        Logger errLogger=new ErrorLogger(Logger.ERROR);
        debugLogger.setNextLogger(infoLogger);

        return  debugLogger;
    }
}

package ChainOfResponsibility.approach1;

public abstract class Logger {
    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;

    public int level;
    public Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    public void logMessage(int level, String message){
      //  System.out.println("this.level "+ this.level + " param --- "+level);
        if(this.level<=level)
        {
            displayLogInfo(message);
        }
        if(nextLogger!=null)
        {
            nextLogger.logMessage(level,message);
        }
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void displayLogInfo(String msg);
}

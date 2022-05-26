package ChainOfResponsibility;

//https://www.youtube.com/watch?v=t43bl_AEA-0

public abstract class Logger {
    public static int DEBUG=1;
    public static int INFO=2;
    public static int ERROR=3;

    public int level;
    public Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    public abstract void logMessage(int level,String message);

    public void setNextLogger(Logger nextLogger){
        this.nextLogger=nextLogger;
    }

}

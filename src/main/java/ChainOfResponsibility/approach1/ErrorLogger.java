package ChainOfResponsibility.approach1;

public class ErrorLogger extends Logger{
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void displayLogInfo(String msg) {
        System.out.println("ErrorLogger" +msg );
    }


}

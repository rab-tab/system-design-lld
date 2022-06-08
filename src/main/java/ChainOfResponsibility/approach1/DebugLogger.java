package ChainOfResponsibility.approach1;

public class DebugLogger extends Logger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void displayLogInfo(String msg) {
        System.out.println("Debug logger---" + msg);
    }


}

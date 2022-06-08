package ChainOfResponsibility.approach1;

public class InfoLogger extends Logger {

    public InfoLogger(int level) {
        super(level);
    }


    @Override
    public void displayLogInfo(String msg) {
        System.out.println(msg);
    }
}

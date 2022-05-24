package ChainOfResponsibility;

import java.util.logging.Handler;

public interface handler {

    void setNextHandler(Handler handler);
    void handle(String imcomingSuspect);
}

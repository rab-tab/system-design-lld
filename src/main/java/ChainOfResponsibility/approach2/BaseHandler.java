package ChainOfResponsibility.approach2;

public abstract class BaseHandler implements handler {
    protected handler nextHandler;

    public void setNextHandler(handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

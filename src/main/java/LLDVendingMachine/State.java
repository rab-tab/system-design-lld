package LLDVendingMachine;

public interface State {

    public void insertCoin(double amount);

    public void pressButton(int number);

    public void dispense(int number);
}

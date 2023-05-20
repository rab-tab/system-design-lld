package vendingMachine;

public class NoCoinInsertedState implements State {
    VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(amount);
        vendingMachine.setVendingMachineCurrState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(int number) {
        throw new IllegalStateException("No coin inserted");
    }

    @Override
    public void dispense(int number) {
        throw new IllegalStateException("No coin is inserted");
    }
}

package vendingMachine;

import vendingMachine.Inventory.Inventory;
import vendingMachine.Inventory.Product;

public class CoinInsertedState implements State {

    VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);

    }

    @Override
    public void pressButton(int number) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(number);
        if (!vendingMachine.hasSufficientAmount(product.getPrice())) {
            throw new IllegalStateException("Insufficent amount to buy the product");
        }

        if (!inventory.checkIfProductAvailable(product.getId()))
            throw new IllegalStateException("Product not available");
        vendingMachine.setVendingMachineCurrState(vendingMachine.getCoinInsertedState());

    }

    @Override
    public void dispense(int number) {
        throw new IllegalStateException("Choose a product");
    }
}

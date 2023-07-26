package LLDVendingMachine;

import LLDVendingMachine.Inventory.Inventory;
import LLDVendingMachine.Inventory.Product;

public class DispenseState implements State {

    VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Product getting dispensed");
    }

    @Override
    public void pressButton(int number) {
        throw new IllegalStateException("Product getting dispensed");
    }

    @Override
    public void dispense(int number) {
        Inventory inventory = vendingMachine.getInventory();
        Product product = inventory.getProductAt(number);
        inventory.deductProductCount(number);
        double change = vendingMachine.getAmount() - product.getPrice();
        vendingMachine.setAmount(0);
        vendingMachine.setVendingMachineCurrState(vendingMachine.getDispenseState());
        System.out.println("product " + product.getName() + " and id " + product.getId() + " dispensed");
    }
}

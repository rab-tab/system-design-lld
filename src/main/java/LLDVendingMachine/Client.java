package LLDVendingMachine;

import LLDVendingMachine.Inventory.Product;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Product dairyMilkShots = new Product("dairy milk shots", 1, 5.0);

        for (int i = 1; i < 3; i++) {
            vendingMachine.addProduct(dairyMilkShots);
        }

        Product parleBiscuit = new Product("parle Biscuit", 2, 20.0);

        for (int i = 1; i < 3; i++) {
            vendingMachine.addProduct(parleBiscuit);
        }

        vendingMachine.insertCoin(5.0);
        vendingMachine.insertCoin(3.0);
        vendingMachine.pressButton(1);

        vendingMachine.insertCoin(5.0);
        vendingMachine.insertCoin(1);

        vendingMachine.insertCoin(7.0);
        vendingMachine.insertCoin(2);

    }
}

package LLDVendingMachine;

import LLDVendingMachine.Inventory.Inventory;
import LLDVendingMachine.Inventory.Product;

public class VendingMachine {
    private NoCoinInsertedState noCoinInsertedState;
    private DispenseState dispenseState;
    private CoinInsertedState coinInsertedState;
    private State vendingMachineCurrState;
    private Inventory inventory;
    private double amount;
    private static final int AISLE_COUNT = 2;

    public VendingMachine() {
        noCoinInsertedState = new NoCoinInsertedState(this);
        // coinInsertedState = new CoinInsertedState(this);
        // dispenseState = new DispenseState(this);
        vendingMachineCurrState = noCoinInsertedState;
        amount = 0.0;
        inventory = new Inventory(AISLE_COUNT);
    }

    public boolean hasSufficientAmount(double expectedAmt) {
        return expectedAmt <= this.amount;
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
        this.coinInsertedState = coinInsertedState;
    }

    public State getVendingMachineCurrState() {
        return vendingMachineCurrState;
    }

    public void setVendingMachineCurrState(State vendingMachineCurrState) {
        this.vendingMachineCurrState = vendingMachineCurrState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void insertCoin(double amt) {
        this.vendingMachineCurrState.insertCoin(amt);
        System.out.println(amount + " coin is inserted");
    }

    public void pressButton(int aisleNumber) {
        this.vendingMachineCurrState.pressButton(aisleNumber);
        this.vendingMachineCurrState.dispense(aisleNumber);
    }

    public void addProduct(Product product)  {
        try {
            this.getInventory().addProduct(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

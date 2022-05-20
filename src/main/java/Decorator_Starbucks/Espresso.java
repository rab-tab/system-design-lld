package Decorator_Starbucks;

public class Espresso extends Beverage{
    public Espresso() {
        beverageName="Espresso";
    }

    @Override
    int getBeveragePrice() {
        return 100;
    }
}

package Decorator.Starbucks;

public class Cappucino extends Beverage {

    public Cappucino() {

        beverageName = "Cappucino coffee";
    }

    @Override
    int getBeveragePrice() {
        return 200;
    }
}

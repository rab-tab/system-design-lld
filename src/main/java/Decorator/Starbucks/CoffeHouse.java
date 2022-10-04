package Decorator.Starbucks;

public class CoffeHouse {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getBeverageName() + " ---- " + beverage.getBeveragePrice());

        beverage = new Milk(beverage);
        System.out.println("After decorating with milk");
        System.out.println(beverage.getBeverageName() + " ---- " + beverage.getBeveragePrice());

    }
}

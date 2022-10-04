package Decorator.CarProblem;

public abstract class Classic implements ICar {

    ICar icar;

    public Classic(ICar iCar) {
        this.icar = iCar;
    }

    @Override
    public String getModel() {
        return icar.getModel();
    }

    @Override
    public String getDescription() {

        return icar.getDescription();
    }

    public abstract String classicFeature();


}

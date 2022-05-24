package Decorator_CarProblem;

public abstract class Gold implements ICar{

    ICar icar;

    public Gold(ICar icar) {
        this.icar = icar;
    }

    @Override
    public String getModel() {
        return icar.getModel();
    }

    @Override
    public String getDescription() {

        return icar.getDescription();
    }

    public abstract String goldFeature();
}

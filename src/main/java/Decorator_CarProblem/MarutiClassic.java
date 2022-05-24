package Decorator_CarProblem;

public class MarutiClassic extends Classic {

    public MarutiClassic(ICar iCar) {
        super(iCar);
    }

    @Override
    public String classicFeature() {
        return "Maruti basic + maruti classic feature";
    }

    @Override
    public String getModel() {
        return super.getModel() + " model of maruti clasic ";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "description of maruti classic ";
    }

}

package Decorator_CarProblem;

public class MarutiGold extends Gold {
    public MarutiGold(ICar icar) {
        super(icar);
    }

    @Override
    public String goldFeature() {
        return "Maruti basic feature + Maruti clasic feature + Maruti gold feature ";
    }

    @Override
    public String getModel() {
        return "maruti gold model";
    }

    @Override
    public String getDescription() {

        return super.getDescription() + "this is maruti gold desc";
    }
}

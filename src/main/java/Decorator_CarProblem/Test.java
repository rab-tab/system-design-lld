package Decorator_CarProblem;

public class Test {

    public static void main(String[] args) {
        //maruti basic model
        System.out.println("Maruti basic model ---------------------------------");
        ICar marutiBasic = new MarutiBasic();
        System.out.println("Desc :: " + marutiBasic.getDescription());
        System.out.println("Model :: " + marutiBasic.getModel());

        System.out.println("Maruti classic model ---------------------------------");
        //maruti classic model
        // which needs to have feature of basic model as well
        Classic marutiClassic = new MarutiClassic(marutiBasic);
        System.out.println("Desc (desc modified ) :: " + marutiClassic.getModel());
        System.out.println("Model  (model modified) ::" + marutiClassic.getDescription());
        System.out.println("Maruti classic feature (new additin)  ::" + marutiClassic.classicFeature());


        System.out.println("Maruti old model ---------------------------------");
        Gold marutiGold = new MarutiGold(marutiClassic);
        System.out.println("Desc (desc modified ) :: " + marutiGold.getModel());
        System.out.println("Model  (model modified) ::" + marutiGold.getDescription());
        System.out.println("Maruti classic feature (new additin)  ::" + marutiGold.goldFeature());


    }
}

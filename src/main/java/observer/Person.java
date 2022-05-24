package observer;

public class Person implements Observer{


    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void notifyMe(int observerId) {
        System.out.println(name +" got notified ..."+" Golden number is "+observerId);
    }
}

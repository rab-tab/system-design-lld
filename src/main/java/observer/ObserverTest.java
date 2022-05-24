package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject radio = new RadioStation();
        Observer ob1 = new Person("person1");
        Observer ob2 = new Person("person2");
        Observer ob3 = new Person("person3");

        radio.notifyObserver();

        radio.register(ob1);
        radio.register(ob2);

        radio.notifyObserver();

        ((RadioStation) radio).updateGoldenNumber(4);

        radio.unregister(ob1);
        radio.unregister(ob2);
        ((RadioStation) radio).updateGoldenNumber(10);


    }
}

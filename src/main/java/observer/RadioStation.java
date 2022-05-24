package observer;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject {

    List<Observer> observers = new ArrayList<>();
    int goldenNumber = 2;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach((Observer o) -> o.notifyMe(goldenNumber));
    }

    public void updateGoldenNumber(int i)
    {
        this.goldenNumber=i;
        notifyObserver();
    }
}

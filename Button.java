
// participant: ConcreteSubject

import java.util.ArrayList;


public class Button implements Subject {
    
    private final ArrayList<Observer> observers;
    private final String name;
    
    public Button(String name) {
        observers = new ArrayList<>();
        this.name = name;
    }
    
    public void click() {
        notifyListeners();
    }

    @Override
    public void addListener(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeListener(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyListeners() {
        for (Observer o: observers) {
            o.actionPerformed("Button:"+name + " has clicked.");
        }
    }
    
}

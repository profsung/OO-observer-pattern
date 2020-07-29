
// participant: ConcreteSubject

import java.util.ArrayList;


public class Menu implements Subject {
    
    private final ArrayList<Observer> observers;
    private final String name;
    
    public Menu(String name) {
        observers = new ArrayList<>();
        this.name = name;
    }
    
    public void select() {
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
            o.actionPerformed("Menu:"+name + " has selected");
        }
    }
    
}

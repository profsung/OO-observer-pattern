
// participant: ConcreteObserver

public class Student implements Observer {
    
    private final String name;
    
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void actionPerformed(String action) {
        System.out.println(name+" is notified: "+action);
    }
    
}

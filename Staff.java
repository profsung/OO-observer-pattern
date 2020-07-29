
// participant: ConcreteObserver

public class Staff implements Observer {
    
    private final String name;
    private final String department;
    
    public Staff(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void actionPerformed(String action) {
        System.out.println(name+"("+department+")"+" is notified: "+action);
    }
    
}

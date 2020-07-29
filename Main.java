
// Example: Observer design pattern
// (c) Dr. Hong K. Sung
public class Main {

    public static void main(String[] args) {

        Button submitButton = new Button("Submit");
        Menu enrollMenu = new Menu("Enroll");

        Student john = new Student("John");
        Student mary = new Student("Mary");
        Staff steve = new Staff("Steve", "Bursar");

        submitButton.addListener(john);
        enrollMenu.addListener(john);
        enrollMenu.addListener(mary);
        submitButton.addListener(steve);

        submitButton.click();
        enrollMenu.select();

    }

}

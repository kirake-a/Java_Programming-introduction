public class Person {
    // Attributes
    String name;
    int age;
    String ID;

    //Constructor Methods
    public Person(String _name, int _age) {
        name = _name;
        age = _age;
    }
    
    // Method overloading, can be if and only id the parameters are different
    public Person(String _ID) {
        ID = _ID;
    }

    // Method overloading with simple methods
    public void run() {
        System.out.println("I'm " + name + ", I'm " + age + " years old, I'm running a marathon");
    }

    public void run(int km) {
        System.out.println("I've run " + km + "km");
    }
}

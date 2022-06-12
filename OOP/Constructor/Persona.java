public class Persona {

    // Attibutes
    String name;
    int age;

    // Methods
    // Constructor method, is always public, don't have a type of return
    public Persona(String _name, int age) { // Has the same name class
        name = _name;
        this.age = age;
    }

    public void showData(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
    }
}
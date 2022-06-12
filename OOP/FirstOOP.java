//package OOP;

/* This is my first java program usin OOP */
public class FirstOOP {
    // Attributes
    String color;
    String brand;
    int km;

    // Methods, main method, here we are going to create the objetcs
    public static void main(String args[]) {
        FirstOOP car1 = new FirstOOP(); //  Craating the first object

        // Giving the object some values for its attributes
        car1.color = "White";
        car1.brand = "Audi";
        car1.km = 0;

        System.out.println("The color of the car 1 is: " + car1.color);
        System.out.println("The brand of the car: " + car1.brand);
        System.out.println("It has " + car1.km + "km");

        // Another object
        FirstOOP car2 = new FirstOOP();

        car2.color = "Red";
        car2.brand = "Ferrari";
        car2.km = 100;

        System.out.println("The color of the car 1 is: " + car2.color);
        System.out.println("The brand of the car: " + car2.brand);
        System.out.println("It has " + car2.km + "km");
    }
}
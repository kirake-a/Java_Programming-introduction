
import java.util.Scanner; // To input data is necessary to import this library...

public class ExampleInput {

    public static void main(String args[]) {
        
        Scanner value = new Scanner(System.in); // Objeto tipo scanner con el nombre de value
        int number;

        System.out.print("Digit a number: ");
        
        number = value.nextInt(); // A la variable se le asigna el objeto que llega del teclado

        System.out.println("The number is: " + number);

        value.close();
    }
    
}
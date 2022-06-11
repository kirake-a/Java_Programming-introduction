import java.util.Scanner;

public class ExampleInputString {

    public static void main(String args[]) {
        Scanner String_new = new Scanner(System.in);
        String cadena;

        System.out.println("Digit a string: ");
        // cadena = String_new.next(); // Saves the string until the user digit a space
        cadena = String_new.nextLine(); // To save all the string

        System.out.println("The string is: " + cadena);

        String_new.close();
    }
    
}

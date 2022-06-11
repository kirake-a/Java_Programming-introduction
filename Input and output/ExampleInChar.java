import java.util.Scanner;

public class ExampleInChar {

    public static void main(String args[]) {
        Scanner letter_char = new Scanner(System.in);
        char letter;

        System.out.print("Digit a letter: ");
        letter = letter_char.next().charAt(0); // charAt saves the element 0 of the string

        System.out.println("The char is: " + letter);

        letter_char.close(); // To close the object declared with Scanner
    }
    
}

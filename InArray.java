import javax.swing.JOptionPane;
import java.util.Scanner;

// HOW TO GIVE VALUES INTO AN ARRAY

public class InArray{
    public static void main(String args[]) {
        int size;

        Scanner input = new Scanner(System.in); // This will be used into the loop to give values to the array
        size = Integer.parseInt(JOptionPane.showInputDialog("Digit the size of the array")); // Defining previously a variable size for the array

        char[] array = new char[size]; // Defining the new array and its size

        for (int i = 0; i < size; i++) {
            System.out.print("Digit a character (" + (i + 1) + "): ");
            
            array[i] = input.next().charAt(0); // Giving the array a value with the helper
        }
        
        input.close(); // Closing Scanner variable

        System.out.println("\nThe characters in the array are:");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
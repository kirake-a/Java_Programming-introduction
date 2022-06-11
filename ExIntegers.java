/* Read 10 integers into a table. Save all the even numbers into another array and
 * the odd numbers into the first one.
 */
import java.util.Scanner;

public class ExIntegers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10]; // Defining the array
        int evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digit an integer: ");

            array[i] = input.nextInt();

            // Knowing how many of the numbers given are even or odd numbers
            if ((array[i] % 2) == 0) {
                evenCounter++;
            }
            else {
                oddCounter++;
            }
        }

        input.close();

        // Some new arrays, for odd or even numbers
        int[] evenArray = new int[evenCounter]; 
        int[] oddArray = new int[oddCounter];
    
        /* We'll use these variables as iterators in the for loop, 
        so we know how many of the numbers are even and odd */
        evenCounter = 0;
        oddCounter = 0;

        for (int i = 0; i < 10; i++) {

            if ((array[i] % 2) == 0) { // If the number is even
                evenArray[evenCounter] = array[i];
                evenCounter++;
            } else { // If the number is odd
                oddArray[oddCounter] = array[i];
                oddCounter++;
            }
        }
        
        // Giving outputs with the two new arrays
        System.out.print("\n\nEven array: ");

        for (int i = 0; i < evenCounter; i++) {
            System.out.print(evenArray[i] + " - ");
        }

        System.out.print("\n\nOdd array: ");

        for (int i = 0; i < oddCounter; i++) {
            System.out.print(oddArray[i] + " - ");
        }
    }
    
}

/* Using bubble sort method */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int array[], size, aux;

        size = Integer.parseInt(JOptionPane.showInputDialog("Digit the size of the array"));

        array  = new int[size]; // Defining the size of the array

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Digit a number: ");

            array[i] = input.nextInt();
        }

        input.close();

        // Bubble sort
        for (int i = 0; i < (size - 1); i++) {
            for (int j = 0; j < (size - 1); j++) {

                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }

        //Output, increasingly ordered array
        System.out.println("\n* Increasingly ordered array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " - ");
        }

        //Output, the array sorted in decreasing order
        System.out.println("\n\n* Array sorted in decreasing order: ");

        for (int i = (size - 1); i >= 0; i--) {
            System.out.print(array[i] + " - ");
        }
    }
}

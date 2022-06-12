/* Using the insertion sort method */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int array[], size, aux, pos;

        size = Integer.parseInt(JOptionPane.showInputDialog("Digit the size of the array"));
        array = new int[size];

        // The user will add the values to the array 
        for (int i = 0; i < size; i++) {
            System.out.print("Digit a number: ");

            array[i] = input.nextInt();
        }

        input.close();

        // Insertion sort
        for (int i = 0; i < size; i++) {
            pos = i;
            aux = array[i];

            while ((pos > 0) && (array[pos - 1] > aux)) {
                array[pos] = array[pos - 1];

                pos--;
            }

            array[pos] = aux;
        }

        // Output in ascending order
        System.out.println("\n* Ascending order: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " - ");
        }

        //Output in desecending order
        System.out.println("\n\n* Descending order: ");

        for (int i = (size - 1); i >= 0; i--) {
            System.out.print(array[i] + " - ");
        }
    }
}

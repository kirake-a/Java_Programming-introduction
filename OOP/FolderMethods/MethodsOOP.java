//package OOP.FolderMethods;

/* This file is to declare all the methods are going to be used into the main program,
 * with the objects delcared there
 */
import javax.swing.JOptionPane;

public class MethodsOOP {
    int num1;
    int num2;
    int sum, sub, mult, div;

    // Method to read numbers
    public void readNumbers() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digit a number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digit another number"));

    }

    // Methods, all the operations
    public void theSum() {
        sum = num1 + num2;
    }

    public void theSub() {
        sub = num1 - num2;
    }

    public void theMult() {
        mult = num1 * num2;
    }

    public void theDiv() {
        div = num1 / num2;
    }

    public void Output() {
        System.out.println("The sum is: " + sum);
        System.out.println("The substraction is: " + sub);
        System.out.println("The multiplication is: " + mult);
        System.out.println("The division is: " + div);
    }

}

package ArithmeticOps;
import java.util.Scanner;

public class ArithmeticOps_1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float number1, number2;
        float add, substraction, mult, div, mod;

        System.out.print("Insert 2 numbers: ");

        number1 = input.nextFloat();
        number2 = input.nextFloat();

        input.close();

        add = number1 + number2;
        substraction = number1 - number2;
        mult = number1 * number2;
        div = number1 / number2;
        mod = number1 % number2;

        System.out.println("\nThe add is: " + add);
        System.out.println("The substraction is: " + substraction);
        System.out.println("The product of the 2 numbers is : " + mult);
        System.out.println("The result of the division is: " + div);
        System.out.println("The module is: " + mod);

    }
    
}

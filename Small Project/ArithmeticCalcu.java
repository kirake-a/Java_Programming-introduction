/* Simple calculator... This calculator only works with integers */
import javax.swing.JOptionPane;

public class ArithmeticCalcu {

    public static void main(String args[]) {
        int num1, num2;
        char action;
        int add, subs, mult, div;

        // The program keeps going and going unless the user do not want it
        do {
            // What will be the action
            action = JOptionPane.showInputDialog("Digit the operation you want to do:\n\nA. Add\nS. substraction\nM. Multiplication\nD. Division\n\nF. Finish\n ").charAt(0);

            // This action help us in case the user puts and upper or lowercase letter, so
            // the program does not breaks
            action = Character.toUpperCase(action);

            // If the user wants to break the program, with 'F', we do it with the if sentence
            if (action == 'F') {
                break;
            }
            else { // else, the user wants to have a result so program continues with the previous action
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digit the number 1: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digit the number 2: "));

                switch (action) {
                    case 'A':
                        add = num1 + num2;

                        JOptionPane.showMessageDialog(null, "Operation: Add\n\n Result: " + add);

                        break;
                    case 'S':
                        subs = num1 - num2;
                        JOptionPane.showMessageDialog(null, "Operation: Substraction\n\n Result: " + subs);

                        break;
                    case 'M':
                        mult = num1 * num2;

                        JOptionPane.showMessageDialog(null, "Operation: Multiplication\n\n Result: " + mult);

                        break;
                    case 'D':
                        div = num1 / num2;

                        JOptionPane.showMessageDialog(null, "Operation: Division\n\n Restul: " + div);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "This option doesn't exist...");
                }

            }
 
        } while (action != 'F'); // Program breaks if the user digits 'f' or 'F'
    }
    
}

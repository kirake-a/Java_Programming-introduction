/* The if sentence
 
 * if(condition){
 * Instruction;
 * }
 * else{
 * Instruction;
 * }
 * 
 */

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String args[]) {
        int number, data = 5;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digit a number: "));

        if (number == data) {
            JOptionPane.showMessageDialog(null, "The number is 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "The number is different to 5");
        }

    }
}
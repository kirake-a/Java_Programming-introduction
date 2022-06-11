/* Ask for numbers until a 0 is typed, do the sum of the previous numbers */

import javax.swing.JOptionPane;

public class LoopsEx2 {
    public static void main(String args[]) {
        float number, sum = 0;

        do{
            number = Float.parseFloat(JOptionPane.showInputDialog("Digit a number: "));

            sum = sum + number;
        } while (number != 0);

        JOptionPane.showMessageDialog(null, "The result is: " + sum);
        
    }
}

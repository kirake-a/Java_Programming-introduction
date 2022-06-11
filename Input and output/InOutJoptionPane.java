/* Input and output data with JoptionPane, which is to get/show user data
 * via popups
 */

import javax.swing.JOptionPane;

public class InOutJoptionPane {

    public static void main(String args[]) {
        String cadena;
        int integer;
        char letter;
        double decimal;

        // Saving data by using JOptionPane
        cadena = JOptionPane.showInputDialog("Digit a string: ");
        integer = Integer.parseInt(JOptionPane.showInputDialog("Digit an integer number: ")); // From string to primitive int
        letter = JOptionPane.showInputDialog("Digit a letter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digit a decimal number: "));

        // Showing the result get from the user via popups
        JOptionPane.showMessageDialog(null, "The string is: " + cadena);
        JOptionPane.showMessageDialog(null, "The integer is: " + integer);
        JOptionPane.showMessageDialog(null, "The letter is: " + letter);
        JOptionPane.showMessageDialog(null, "The double number is: " + decimal);
    }
    
}

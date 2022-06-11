/* Make a program that reads a character from the keyboard and checks 
 * if it is an uppercase letter
 */

import javax.swing.JOptionPane; // Library to use JOptionPane

public class Letters {

    public static void main(String args[]) {
        char letter;

        letter = JOptionPane.showInputDialog("Digit a letter: ").charAt(0);

        // Checking if the letter is uppercase with an if sentence
        if (Character.isUpperCase(letter)) {
            JOptionPane.showMessageDialog(null, "This is an uppercase letter");
        }
        else {
            JOptionPane.showMessageDialog(null, "This isn't uppercase");
        }
    }
    
}

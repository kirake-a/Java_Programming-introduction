/* The swtich sentence
 * 
 * Swtich(data){
 * case1:
 *  Instruction 1;
 *  break;
 * case 2: 
 *  Instruction 2;
 *  break;
 * 
 * ...
 * 
 * case n:
 *  Instruction n;
 *  break;
 * defaul: 
 *  Default instruction;
 *  break;
 * }
 */

import javax.swing.JOptionPane;

public class SwitchConditional {

    public static void main(String args[]) {
        int data;
        
        data = Integer.parseInt(JOptionPane.showInputDialog("Digit a number between 1-5: "));

        switch (data){
            case 1:
                JOptionPane.showMessageDialog(null, "This is number 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "This is number 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "This is number 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "This is number 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "This is number 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "This isn't a number between 1-5");
                break;
                
        }
    }
    
}
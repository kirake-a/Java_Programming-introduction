import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digit the number 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digit the number 2"));

        Operations op = new Operations(); // Creating the object

        // Let's do the ops
        op.theSum(num1, num2);
        op.theSub(num1, num2);
        op.theMult(num1, num2);
        op.theDiv(num1, num2);

        // Output, showing all the results
        op.Output();
    }
}

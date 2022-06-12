import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digit the number 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digit the number 2"));

        OperatorsRet op = new OperatorsRet(); // Creating the object

        // Let's do the ops
        int sum = op.theSum(num1, num2);
        int sub = op.theSub(num1, num2);
        int mult = op.theMult(num1, num2);
        int div = op.theDiv(num1, num2);

        // Output, showing all the results
        op.Output(sum, sub, mult, div);
    }
}

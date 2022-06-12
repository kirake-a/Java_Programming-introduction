public class OperatorsRet {

    // Methods, all the operations
    public int theSum(int num1, int num2) {
        int sum;

        sum = num1 + num2;

        return sum;
    }

    public int theSub(int num1, int num2) {
        int sub;

        sub = num1 - num2;

        return sub;
    }

    public int theMult(int num1, int num2) {
        int mult;

        mult = num1 * num2;

        return mult;
    }

    public int theDiv(int num1, int num2) {
        int div;

        div = num1 / num2;

        return div;
    }

    public void Output(int sum, int sub, int mult, int div) {
        System.out.println("The sum is: " + sum);
        System.out.println("The substraction is: " + sub);
        System.out.println("The multiplication is: " + mult);
        System.out.println("The division is: " + div);
    }

}

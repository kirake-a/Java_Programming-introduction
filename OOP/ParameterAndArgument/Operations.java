public class Operations {
    int sum, sub, mult, div;

    // Methods, all the operations
    public void theSum(int num1, int num2) {
        sum = num1 + num2;
    }

    public void theSub(int num1, int num2) {
        sub = num1 - num2;
    }

    public void theMult(int num1, int num2) {
        mult = num1 * num2;
    }

    public void theDiv(int num1, int num2) {
        div = num1 / num2;
    }

    public void Output() {
        System.out.println("The sum is: " + sum);
        System.out.println("The substraction is: " + sub);
        System.out.println("The multiplication is: " + mult);
        System.out.println("The division is: " + div);
    }
    
}
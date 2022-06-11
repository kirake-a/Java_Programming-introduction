import javax.swing.JOptionPane;

/* FOR loop
 * 
 * for(initilization; condition; increase or decrease){
 * Instructions;
 * }
 */

 //Generate a random number between 0-100 so that the user can guess it, 
 // at the end show how many attempts he made

public class LoopsEx {
    public static void main(String args[]) {
        int number, random_num, counter = 0;
        
        random_num = (int) (Math.random() * 100); // Generating a random number between 0-100

        do{
            number = Integer.parseInt(JOptionPane.showInputDialog("Digit a number"));

            // Behavior of the number given by the user
            if(random_num > number){
                System.out.println("Digit a major number");
            }
            else{
                System.out.println("Digit a minor number");
            }

            counter++; // The user have another attempt, so the counter increases

        } while (number != random_num);
        
        // Outputs for the user...
        System.out.println("\n\nGreat you have the correct number!");
        System.out.println("Attempts: " + counter);
    }
}
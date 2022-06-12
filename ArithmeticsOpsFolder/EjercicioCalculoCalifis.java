
/* Calculating your final grade by knowing 3 previous grades */
import java.util.Scanner;

public class EjercicioCalculoCalifis {

    public static void main(String args[]) {
        
        float calif1, calif2, calif3;
        float final_grade;

        Scanner input = new Scanner(System.in);
       
        // Having the grades from the user 
        System.out.print("Insert yor 1st grade: ");
        calif1 = input.nextFloat();
        System.out.print("Insert your 2nd grade: ");
        calif2 = input.nextFloat();
        System.out.print("Insert your 3rd grade: ");
        calif3 = input.nextFloat();

        input.close();

        final_grade = calif1 + calif2 + calif3;

        System.out.println("\nYour final grade is: " + final_grade);

    }
    
}


/* program that calculates and prints an employee's weekly wage from their 
weekly hours worked and their hourly wage. */
import java.util.Scanner;

public class EjercicioPagoHorasTrabajo {

    public static void main(String args[]) {

        float pay_per_hour, hours_worked;
        float your_pay;
        Scanner input = new Scanner(System.in);

        System.out.print("Your pay per hour of work: ");
        pay_per_hour = input.nextFloat();
        System.out.print("The hours you worked this week: ");
        hours_worked = input.nextInt();

        input.close();

        your_pay = hours_worked * pay_per_hour;

        System.out.println("Your have for salary this week: $" + your_pay);  
    }
    
}

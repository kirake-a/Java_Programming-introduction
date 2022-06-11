import javax.swing.JOptionPane;

/* Given the ages and the height of 5 students, show the age and the height,
 * show too how many of them are more than 18 years old, and how many are over 
 * 1.75m tall.
 */
public class AverageStudents {
    public static void main(String args[]) {
        int age, sum_age = 0, counter18 = 0, counter175 = 0;
        float height, sum_height = 0, averageHeight, avergaeAge;

        for (int i = 0; i <= 5; i++) {
            age = Integer.parseInt(JOptionPane.showInputDialog("Age " + i + ":"));
            height = Float.parseFloat(JOptionPane.showInputDialog("Height " + i + ":"));

            sum_age += age;
            sum_height += height;

            if (age >= 18) {
                counter18 += 1;
            }

            if (height >= 1.75) {
                counter175 += 1;
            }
        }

        averageHeight = (float) sum_height / 5;
        avergaeAge = (float) sum_age / 5;

        System.out.println("The average of ages is: " + avergaeAge);
        System.out.println("The average of heights is: " + averageHeight);

        System.out.println("There are " + counter18 + " students more than 18 years old");
        System.out.println("There are " + counter175 + " students over 1.75m tall");
    }
    
}

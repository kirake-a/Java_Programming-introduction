
// Calculating the average of a determined amount of numbers

public class Average {
    public static void main(String args[]) {
        System.out.print("Cantidad de numeros a insertar: ");

        int a = Integer.parseInt(System.console().readLine());
        int i = 0, s = 0;

        while (i < a) {
            System.out.println("Digita un numero: ");
            int n = Integer.parseInt(System.console().readLine());

            s += n;
            i += 1;

            // final int z = 50; // This a constant number, not a variable, can't change its value

        }

        float media = s / a;

        System.out.println("La media valor: " + media);
    }

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat1
{
    public Activitat1(){}

    public void activitat1(){
        //Scanner per poder introduir les dades.
        Scanner sc = new Scanner(System.in);

        try {
            // Demanam el primer nombre.
            System.out.print("Primer nombre: ");
            int num1 = sc.nextInt();

            // Demanam el segon nombre.
            System.out.print("Segon nombre: ");
            int num2 = sc.nextInt();

            // Feim els calculs.
            System.out.println("Suma:" + (num1 + num2));
            System.out.println("Resta:" + (num1 - num2));
            System.out.println("Multiplicacio:" + (num1 * num2));

            if (num2 != 0) {
                double resDivisio = (double)num1/num2;
                System.out.println("Divisio:" + resDivisio);
            } else {
                System.out.println("Divisio: No es posible dividir por cero.");
            }

        } catch (InputMismatchException e) {
            System.err.println("ERROR: S'ha d'introduir un numero valid.");
        }

    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat2
{
    public Activitat2(){}

    public void activitat2(){
        //Scanner per poder introduir les dades.
        Scanner sc = new Scanner(System.in);

        //Demanam el nom de l'alumne amb l'scanner.
        System.out.print("Nom de l'alumne: ");
        String nom = sc.nextLine();

        try {
            double primer, segon, tercer;

            // Demana la primera nota.
            do {
                System.out.print("NOTA primer trimestre (0-10): ");
                primer = sc.nextDouble();
            } while (primer < 0 || primer > 10);

            // Demana la segona nota.
            do {
                System.out.print("NOTA segon trimestre (0-10): ");
                segon = sc.nextDouble();
            } while (segon < 0 || segon > 10);

            // Demana la tercera nota.
            do {
                System.out.print("NOTA tercer trimestre (0-10): ");
                tercer = sc.nextDouble();
            } while (tercer < 0 || tercer > 10);

            // Calcula la nota mitjana.
            double notamitjana = (primer + segon + tercer) / 3;

            // Mostra el resultat.
            System.out.println("La nota mitjana de l'alumne " + nom + " es de " + notamitjana);
        } catch (InputMismatchException e) {
            System.err.println("ERROR: S'ha d'introduir un numero valid.");
        }

    }
}
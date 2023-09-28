import java.util.Scanner;

public class Activitat2
{
    public static void main(String[] args)
    {
        //Scanner per poder introduir les dades.
        Scanner sc = new Scanner(System.in);

        //Demanam el nom de l'alumne amb l'scanner.
        System.out.print("Nom de l'alumne: ");
        String nom = sc.nextLine();

        //Demanam primera nota.
        System.out.print("NOTA primer trimestre: ");
        int primer = sc.nextInt();

        //Demanam segona nota.
        System.out.print("NOTA segon trimestre: ");
        int segon = sc.nextInt();

        //Demanam tercera nota.
        System.out.print("NOTA tercer trimestre: ");
        int tercer = sc.nextInt();

        //Calculam la nota(només per tres nombres).
        int notamitjana = (primer + segon + tercer) / 3;

        //Mostram el resultat.
        System.out.println("La nota mitjana de l'alumne " + nom + " es de " + notamitjana);
    }
}
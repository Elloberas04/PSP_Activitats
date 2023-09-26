import java.util.Scanner;

public class Activitat2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom de l'alumne: ");
        String nom = sc.nextLine();

        System.out.print("NOTA primer trimestre: ");
        int primer = sc.nextInt();

        System.out.print("NOTA segon trimestre: ");
        int segon = sc.nextInt();

        System.out.print("NOTA tercer trimestre: ");
        int tercer = sc.nextInt();

        int notamitjana = (primer + segon + tercer) / 3;

        System.out.println("La nota mitjana de l'alumne " + nom + " es de " + notamitjana);
    }
}
import java.util.Scanner;

public class Activitat3
{
    public static void main(String[] args)
    {
        //Scanner per demanar les dades.
        Scanner sc = new Scanner(System.in);

        System.out.print("Hores de feina al DIA: ");
        int horesDia = sc.nextInt();

        System.out.print("Dies de feina al MES: ");
        int diesMes = sc.nextInt();

        System.out.print("Sou per hora: ");
        int souHora = sc.nextInt();

        sc.close(); //Tancam l'Scanner

        //Calculam el sou.
        int resultat = (horesDia * diesMes) * souHora;

        //Mostram el resultat.
        System.out.println("El sou del treballador es de " + resultat + "€");
    }
}
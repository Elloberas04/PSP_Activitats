import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat3
{
    public Activitat3(){}

    public void activitat3(){
        //Scanner per demanar les dades.
        Scanner sc = new Scanner(System.in);

        try {

            int horesDia,diesMes;

            //Demana les hores de feina(de 0 a 24 hores).
            do {
                System.out.print("Hores de feina al DIA (0-24): ");
                horesDia = sc.nextInt();
            } while (horesDia < 0 || horesDia > 24);

            //Demana dies de feina al mes(de 0 a 32 dies).
            do {
                System.out.print("Dies de feina al MES (0-32): ");
                diesMes = sc.nextInt();
            } while (diesMes < 0 || diesMes > 32);

            System.out.print("Sou per hora: ");
            int souHora = sc.nextInt();

            //Calculam el sou.
            int resultat = (horesDia * diesMes) * souHora;

            //Mostram el resultat.
            System.out.println("El sou del treballador es de " + resultat + "€");
        } catch (InputMismatchException e) {
            System.err.println("ERROR: S'ha d'introduir un numero valid (enter(int)).");
        }
    }
}
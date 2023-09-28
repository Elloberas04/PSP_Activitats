import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activitat4
{
    public Activitat4(){}

    public void activitat4(){
        try {
            //InputStreamReader i BufferedReader per poder llegir el que introdueix l'usuari.
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bis = new BufferedReader(isr);

            System.out.print("Escriu un STRING: ");
            String string = bis.readLine();
            System.out.println("S'ha introduit l'String: " + string);

            System.out.print("Escriu un INT: ");
            int numero = Integer.parseInt(bis.readLine());
            System.out.println("S'ha introduit el INT: " + numero);

            System.out.print("Escriu un FLOAT: ");
            float numFloat = Float.parseFloat(bis.readLine());
            System.out.println("S'ha introduit el FLOAT: " + numFloat);

            System.out.print("Escriu un DOUBLE: ");
            Double numDouble = Double.parseDouble(bis.readLine());
            System.out.println("S'ha introduit el DOUBLE: " + numDouble);
        } catch (NumberFormatException e) { //Si el format de les dades introduides segons sigui int, float o double es incorrecte.
            System.err.println("LES DADES INTRODUIDES NO SON CORRECTES...");
            System.err.println("ERROR: " + e.getMessage());
        } catch (IOException e) { //Altres errors.
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}

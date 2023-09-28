import java.io.*;
import java.util.Scanner;

public class Activitat5
{

    // Metode per llegir i imprimir el contingut d'un fitxer
    public static void llegir(String nomFitxer) {
        try {
            //Indicam el nostre fitxer.
            BufferedReader reader = new BufferedReader(new FileReader(nomFitxer));
            String linia;
            //WHILE per llegir cada linea del fitxer e imprimir-la
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
            reader.close();
        } catch (IOException e) { //Per si hi ha errors.
            System.err.println("Error de lectura del fitxer: " + e.getMessage());
        }
    }

    // Metode per escriure text al final d'un fitxer
    public static void escriure(String nomFitxer, String text) {
        try {
            //Indicam el nostre fitxer.
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer, true));
            writer.newLine(); //Nova linea.
            writer.write(text); //Escrivim el text.
            writer.close(); //Tancam el writer.
            System.out.println("Text escrit correctament al fitxer.");
        } catch (IOException e) { //Per si hi ha errors.
            System.err.println("Error d'escriptura al fitxer: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String nomFitxer = "./test.txt";
        System.out.println("FITXER: " +  nomFitxer);

        System.out.println("--------Contingut del fitxer--------");
        //Cridam la funcio 'llegir' indicant per parametre l'arxiu.
        llegir(nomFitxer);

        Scanner sc = new Scanner(System.in);

        System.out.println("--------Escriure al fitxer--------");
        System.out.println("Escriu el nou contingut:");

        String textPerEscriure = sc.nextLine();
        //Cridam la funcio 'escriure' indicant per parametre l'arxiu i la frase.
        escriure(nomFitxer, textPerEscriure);
    }
}

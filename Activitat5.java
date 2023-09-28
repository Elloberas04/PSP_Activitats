import java.io.*;
import java.util.Scanner;

public class Activitat5
{

    public Activitat5(){}

    // Metode per llegir i imprimir el contingut d'un fitxer
    public void llegir(String nomFitxer) {
        System.out.println("Contingut de l'arxiu:" + "\n" + "--------------------------");
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
    public void escriure(String nomFitxer) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu el nou contingut:");

        String textNou = sc.nextLine();

        try {
            //Indicam el nostre fitxer.
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer, true));
            writer.newLine(); //Nova linea.
            writer.write(textNou); //Escrivim el text.
            writer.close(); //Tancam el writer.
            System.out.println("Text escrit correctament al fitxer.");
        } catch (IOException e) { //Per si hi ha errors.
            System.err.println("Error d'escriptura al fitxer: " + e.getMessage());
        }
    }
}

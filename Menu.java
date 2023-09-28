import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu
{
    String header;
    String[] options;


    public Menu(String header, String ... options)
    {
        this.header = header;
        this.options = options;
    }

    public void show()
    {
        System.out.println("=".repeat(18));
        System.out.println(header);
        System.out.println("=".repeat(18));
        int counter = 0;
        for (String option : options)
            System.out.println(++counter + " -> " + option);
        System.out.println("=".repeat(18));
        System.out.println("0 -> Exit");
        System.out.println("=".repeat(18));
    }

    public int getOption()
    {
        try {
            Scanner get = new Scanner(System.in);

            show();

            return get.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("ERROR: S'ha d'introduir un numero valid.");
            return -1;
        }
    }

    public void doNothing() {}
}
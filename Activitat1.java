import java.util.Scanner;

public class Activitat1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer nombre: ");
        int num1 = sc.nextInt();

        System.out.print("Segon nombre: ");
        int num2 = sc.nextInt();

        System.out.println("Suma:" + (num1 + num2));
        System.out.println("Resta:" + (num1 - num2));
        System.out.println("Multiplicacio:" + (num1 * num2));
        System.out.println("Divisio:" + (num1 / num2));
    }
}

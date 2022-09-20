import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionTest
{
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            // Gestion des exception
            scanner = new Scanner(System.in);
            System.out.println(" Entrer le numerateur :");
            int x = scanner.nextInt();

            System.out.println(" Entrer le denominateur :");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println(" Resultat :" + z);

        } catch (ArithmeticException e) {
            System.out.println("Division par 0 interdit !!!!!");
        } catch (InputMismatchException e) {
            System.out.println("Incompatiilité entre le num et le denom !!!!!");
        } catch (Exception e) {
            System.out.println("Quelque chose ne va pas !!!!!");
        } finally {
            scanner.close();
        }


    }
}

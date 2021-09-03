import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplica {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);

        int a , b, PROD;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        b = scanner.nextInt();

        PROD = a * b;
        System.out.println("PROD = " + PROD);
        scanner.close();
    }
}




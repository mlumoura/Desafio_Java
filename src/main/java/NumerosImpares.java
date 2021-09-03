/*
Leia um valor inteiro X 1 <= X <= 1000. Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X,se for o caso.
 */

import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        Integer X, i, resto;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor maior que 1 e menor que 1000: ");
        X = scanner.nextInt();
        scanner.close();

        for (i = 1; i < X+1; i++) {  // não entra aqui se usar i == X
            resto = i % 2;
            if (resto > 0)
            System.out.println(i);
        }
    }
}
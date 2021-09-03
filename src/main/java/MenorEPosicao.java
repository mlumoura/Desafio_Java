/*
Desenvolva um código que leia um valor E. Este E será o tamanho de um vetor X[E].

A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua
posição dentro do vetor, mostrando esta informação.

Entrada
A primeira linha de entrada contem um único inteiro E 1 < E < 1000, indicando o número de elementos que
deverão ser lidos em seguida para o vetor X[E] de inteiros. A segunda linha contém cada um dos E valores,
separados por um espaço.
Saída
A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A
segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra
o menor valor lido, lembrando que o vetor inicial na posição zero.

 */


import java.util.Scanner;

public class MenorEPosicao {
    public static void main(String[] args) {
        Integer E, i, pos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor maior que 1 e menor que 1000: ");
        E = scanner.nextInt();

        // Criar o vetor X com o tamanho E
        int[] X = new int[E]; // alocação de espaço para vetor

        for (i = 0; i < E; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i+1), E);
            X[i] = scanner.nextInt();
        }
        // Menor valor digitado
        int menor = X[0];

        for (i=0; i<E; i++) {
            if (X[i] < menor)
                menor = X[i];
        }
        //Saídas
        for (i=0; i<E; i++) {
            if (X[i] == menor)
                pos = i;
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição: " + pos);
    }
}

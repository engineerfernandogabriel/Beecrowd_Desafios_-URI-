package src.src.beecrowd.iniciante;

/*
 Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].

 Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

ENTRADA
 A entrada contem um valor de dupla precisão com 4 casas decimais.

SAÍDA
 Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.

 Cada valor do vetor deve ser apresentado com 4 casas decimais.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1178_PreenchimentoDeVetorIII {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();

        for(int i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f\n", i, number);

            number /= 2;
        }
    }
}

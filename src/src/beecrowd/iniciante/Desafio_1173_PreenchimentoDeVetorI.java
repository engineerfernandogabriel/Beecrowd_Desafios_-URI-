package src.src.beecrowd.iniciante;

/*
  Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10].

  Em cada posição subsequente, coloque o dobro do valor da posição anterior.

  Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

ENTRADA
 A entrada contém um valor inteiro (V<=50).

SAÍDA
 Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i.

 O primeiro número do vetor N (N[0]) irá receber o valor de V.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1173_PreenchimentoDeVetorI {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();

        for(int i = 0; i < 10; i++){
            System.out.printf("N[%d] = %d\n", i, firstNumber);

            firstNumber *= 2;
        }

    }
}

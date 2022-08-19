package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

ENTRADA
 A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

SAÍDA
 Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1177_PreenchimentoDeVetorII {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for(int i = 0; i < 1000;){
            int count = 0;
            while(count < number){
                System.out.printf("N[%d] = %d\n", i, count);
                count++;
                i++;
            }
        }
    }
}

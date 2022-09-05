package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um vetor N[20].

 Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

ENTRADA
 A entrada contém 20 valores inteiros, positivos ou negativos.

SAÍDA
 Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1175_TrocaEmVetor {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int[] listNumbers = new int[20];

        for(int i = 19; i > -1; i--){
            int number = input.nextInt();

            listNumbers[i] = number;
        }

        for(int j = 0; j < listNumbers.length; j++){
            System.out.printf("N[%d] = %d\n", j, listNumbers[j]);
        }
    }
}

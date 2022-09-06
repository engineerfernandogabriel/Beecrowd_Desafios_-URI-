package src.src.beecrowd.iniciante;

/*
 Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou ímpares.

 Só que o tamanho de cada um dos dois vetores é de 5 posições.

 Então, cada vez que um dos dois vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos.

 Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar.

 Cada vetor pode ser preenchido tantas vezes quantas for necessário.

ENTRADA
 A entrada contém 15 números inteiros.

SAÍDA
 Imprima a saída conforme o exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1179_PreenchimentoDeVetorIV {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int count = 0;
        int x = 0;
        int y = 0;

        while (count < 15) {
            int number = input.nextInt();

            if (number % 2 == 0) {
                par[x] = number;
                x++;
                if (x > 4) {
                    for (int i = 0; i < par.length; i++) {
                        System.out.printf("par[%d] = %d\n", i, par[i]);
                    }
                }
            } else {
                impar[y] = number;
                y++;
                if (y > 4) {
                    for (int j = 0; j < impar.length; j++) {
                        System.out.printf("impar[%d] = %d\n", j, impar[j]);
                    }
                }

                count++;
            }
        }
    }
}

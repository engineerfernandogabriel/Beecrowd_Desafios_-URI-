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
import java.util.ArrayList;
import java.util.Scanner;

public class Desafio_1179_PreenchimentoDeVetorIV {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        int count = 0;

        while (count < 15) {
            int number = input.nextInt();

            if (number % 2 == 0) {
                par.add(number);
                if (par.size() > 5) {
                    for (int i = 0; i < par.size(); i++) {
                        System.out.printf("par[%d] = %d\n", i, par.get(i));
                    }
                    par.clear();
                }
            } else {
                impar.add(number);
                if (impar.size() > 5) {
                    for (int j = 0; j < impar.size(); j++) {
                        System.out.printf("impar[%d] = %d\n", j, impar.get(j));
                    }
                    impar.clear();
                }
            }
            count++;
        }

        for (int j = 0; j < impar.size(); j++) {
            System.out.printf("impar[%d] = %d\n", j, impar.get(j));
        }

        for (int i = 0; i < par.size(); i++) {
            System.out.printf("par[%d] = %d\n", i, par.get(i));
        }
    }
}

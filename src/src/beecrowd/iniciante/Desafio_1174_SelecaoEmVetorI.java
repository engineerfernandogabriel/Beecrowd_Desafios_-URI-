package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um vetor A[100].

 No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

ENTRADA
 A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

SAIDA
 Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1174_SelecaoEmVetorI {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            double number = input.nextDouble();

            if(number <= 10) System.out.printf("A[%d] = %.1f\n", i, number);
        }
    }
}



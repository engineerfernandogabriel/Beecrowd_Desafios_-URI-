package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um vetor X[10].

 Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

ENTRADA
 A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

SAÍDA
 Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1172_SubstituicoEmVetorI {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            int numberIn = input.nextInt();
            int x = numberIn;

            if(numberIn <= 0) x = 1;

            System.out.printf("X[%d] = %d\n", i,x);
        }
    }
}

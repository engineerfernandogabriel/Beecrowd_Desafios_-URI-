package src.src.beecrowd.iniciante;

/*
 Escreva um programa que leia dois valores X e Y.

 A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

ENTRADA
 O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

SAÍDA
 Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo.

 Não deve haver espaço em branco após o último valor da linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1145_Sequencia2 {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int count = 0;

        for(int i = 1; i <= secondNumber; i++){
            System.out.print(i + " ");
            count++;
            if(count == firstNumber){
                System.out.println();
                count = 0;
            }

        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido.

 Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele.

 Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.

ENTRADA
 A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste.

 Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.

SAÍDA
 Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1176_FibonacciEmVetor {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        int count = 3;

        for(int i = 0; i < test; i++){
            int number = input.nextInt();

            if(number == 0) System.out.printf("Fib(%d) = 0\n", number);
            else if (number == 1 || number == 2) System.out.printf("Fib(%d) = 1\n", number);
            else {
                int actualNumber = 1;
                int afterNumber = 1;
                int nextSum = 0;
                while(count <= number){
                    nextSum =  actualNumber + afterNumber;
                    afterNumber = actualNumber;
                    actualNumber = nextSum;
                    count++;
                }
                System.out.printf("Fib(%d) = %d\n", number, nextSum);
                count = 3;
            }
        }
    }
}


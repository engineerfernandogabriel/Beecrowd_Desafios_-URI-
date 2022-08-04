package src.src.beecrowd.iniciante;

/*
 A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.

 Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.

 Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 46).

SAÍA
 Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1151_FibonacciFacil {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numberN = input.nextInt();
        int first = 0;
        int second = 1;
        int fibonacci = 0;
        int count = 0;

        System.out.print(first + " " + second);

        while(count < (numberN - 2)){
            fibonacci = second + first;
            first = second;
            second = fibonacci;
            count++;
            System.out.print(" " + fibonacci);
        }
    }
}

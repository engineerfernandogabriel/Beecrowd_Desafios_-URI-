package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro X (1 <= X <= 1000).
 Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

ENTRADA
 O arquivo de entrada contém 1 valor inteiro qualquer.

SAÍDA
 Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1067_NumerosImpares {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= num; i+= 2) {
            System.out.println(i);
        }
    }
}

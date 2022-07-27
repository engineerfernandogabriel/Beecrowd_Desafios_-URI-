package src.src.beecrowd.iniciante;

/*
 Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

ENTRADA
 A entrada contém um valor inteiro N (0 < N < 13).

SAÍDA
 A saída contém um valor inteiro, correspondente ao fatorial de N.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1153_FatorialSimples {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int fatorial = input.nextInt();
        int sum = 1;
        int valueFatorial = 0;

        for(int i = fatorial; i > 1; i--){
            valueFatorial = i * (sum);
            sum = valueFatorial;
        }

        System.out.println(valueFatorial);
    }
}

package src.src.beecrowd.iniciante;

/*
 Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).

 Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

ENTRADA
 O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.

SAÍDA
 Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1101_SequenciaDeNumerosESoma {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);
        boolean continuous = true;
        int sum = 0;
        int bigger = 0;
        int lower = 0;

        do{
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            if (number1 > 0 && number2 > 0){
                bigger = Math.max(number1, number2);
                lower = Math.min(number1,number2);

                for(int i = lower; i <= bigger; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }

                System.out.println("Sum=" + sum);

                sum =0;

            } else{
                continuous = false;
            }

        }while(continuous);

    }
}

package src.src.beecrowd.iniciante;

/*
 Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

ENTRADA
 O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

SAÍDA
 Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1132_MultiplosDe13 {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int count = 0;

        for(int i = number1; i <= number2; i++){
            if(i % 13 != 0){
                count+= i;
            }
        }

        System.out.println(count);
    }
}

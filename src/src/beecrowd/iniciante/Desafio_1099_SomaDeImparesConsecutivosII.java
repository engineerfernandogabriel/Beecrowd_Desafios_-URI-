package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
 Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

SAÍDA
 Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1099_SomaDeImparesConsecutivosII {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();
        int larger = 0;
        int smaller = 0;
        int soma = 0;

        for(int i = 0; i < tests; i++){
            int numberX = input.nextInt();
            int numberY = input.nextInt();

            if(numberX > numberY){
                larger = numberX;
                smaller = numberY;
            } else{
                larger = numberY;
                smaller = numberX;
            }

            int j = 0;
            for(j = smaller + 1; j < larger; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }

            System.out.println(soma);
            soma = 0;
        }
    }
}

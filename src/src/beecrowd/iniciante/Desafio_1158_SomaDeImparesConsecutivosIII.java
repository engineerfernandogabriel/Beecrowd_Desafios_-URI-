package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.

 Cada caso de teste consiste de dois inteiros X e Y.

 Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
 para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.

 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

SAÍDA
 Imprima a soma dos consecutivos números ímpares a partir do valor X.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1158_SomaDeImparesConsecutivosIII {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int testsNumbers = input.nextInt();
        int sum = 0;
        int tests = 0;

        while(tests < testsNumbers){
            int firstNumber = input.nextInt();
            int secondNumber = input.nextInt();

            if(firstNumber % 2 != 0){
                for(int i = 0; i < secondNumber; i++){
                    sum += firstNumber;
                    firstNumber+=2;
                }
                System.out.println(sum);
            }else{
                firstNumber++;

                for(int i = 0; i < secondNumber; i++){
                    sum += firstNumber;
                    firstNumber+=2;
                }
                System.out.println(sum);
            }

            sum = 0;
            tests++;
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo.

 Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

ENTRADA
 A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada.

 Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

SAÍDA
 Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a especificação fornecida.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1165_NumeroPrimo {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int testsNumbers = input.nextInt();
        int count = 0;

        while(count < testsNumbers){
            int number = input.nextInt();
            boolean test = false;

            for(int j = 2; j < number; j++){
                if(number % j == 0){
                    test = true;
                    break;
                }
            }

            if(!test) System.out.printf("%d eh primo\n", number);
            else System.out.printf("%d nao eh primo\n", number);

            count++;
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número.

 Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.

ENTRADA
 A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste da entrada.

 Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.

SAÍDA
 Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_164_NumeroPerfeito {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int testsNumber = input.nextInt();

        for(int i=0; i < testsNumber; i++){
            int sum = 1;
            int number = input.nextInt();

            for(int j=2; j < number; j++){
                if((number % j) == 0){
                    sum += j;
                }
            }

            if(sum == number) System.out.printf("%d eh perfeito\n", number);
            else System.out.printf("%d nao eh perfeito\n", number);
        }
    }
}

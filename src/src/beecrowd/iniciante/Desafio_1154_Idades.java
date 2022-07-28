package src.src.beecrowd.iniciante;

/*
 Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.

 O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

ENTRADA
 A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

SAÍDA
 A saída contém um valor correspondente à média de idade dos indivíduos.

 A média deve ser impressa com dois dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1154_Idades {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int number =0;
        double soma = 0;
        int count = 0;

        while(number >= 0){
            number = input.nextInt();

            if(number > 0){
                soma += number;
                count++;
            }
        }
        double media = soma / count;
        System.out.printf("%.2f", media);
    }
}

package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N].

 A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.

ENTRADA
 A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor X[N] de inteiros.

 A segunda linha contém cada um dos N valores, separados por um espaço. Vale lembrar que nenhuma entrada haverá números repetidos.

SAÍDA
 A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada.

 A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1180_MenorEPosicao {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numberElements = input.nextInt();
        int position = 0;
        int minorValue = 0;
        int number = 0;

        int[] listNumbers = new int[numberElements];

        for(int j = 0; j < listNumbers.length; j++){
            number = input.nextInt();
            listNumbers[j] = number;
        }

        for(int i = 0; i < listNumbers.length; i++){
            if (i == 0){
                position = i;
                minorValue = listNumbers[i];
            }else if(listNumbers[i] < listNumbers[i - 1]){
                position = i;
                minorValue = listNumbers[i];
            }
        }

        System.out.printf("Menor valor: %d\n", minorValue);
        System.out.printf("Posicao: %d\n", position);
    }
}

package src.src.beecrowd.iniciante;

/*
 Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
 Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

ENTRADA
 A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

SAÍDA
 O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1064_PositivosEMedias {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int cont = 0;
        double soma = 0;

        for(int i = 0; i < 6; i++){
            double entrada = input.nextDouble();

            if(entrada > 0){
                cont++;
                soma += entrada;
            }
        }

        double media = soma / cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}

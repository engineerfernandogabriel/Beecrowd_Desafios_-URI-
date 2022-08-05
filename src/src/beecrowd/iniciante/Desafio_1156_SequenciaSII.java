package src.src.beecrowd.iniciante;

/*
 Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
 S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

ENTRADA
 Não há nenhuma entrada neste problema.

SAÍDA
 A saída contém um valor correspondente ao valor de S.

 O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

import java.io.IOException;

public class Desafio_1156_SequenciaSII {

    public static void main(String[] args) throws IOException{

        double sum = 1;

        for(int i = 3, j = 2; i <= 39; i+=2, j*=2){
            sum += (double) (i) / (j) ;
        }

        System.out.printf("%.2f", sum);
    }
}

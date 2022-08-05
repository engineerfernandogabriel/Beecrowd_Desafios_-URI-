package src.src.beecrowd.iniciante;

/*
 Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
 S = 1 + 1/2 + 1/3 + … + 1/100

ENTRADA
 Não há nenhuma entrada neste problema.

SAÍDA
 A saída contém um valor correspondente ao valor de S.

 O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

import java.io.IOException;

public class Desafio_1155_SequenciaS {

    public static void main(String[] args) throws IOException{

        double sum = 0;

        for(int i = 1; i <=100; i++){
            sum += (double) 1/i;
        }
        System.out.printf("%.2f", sum);
    }
}

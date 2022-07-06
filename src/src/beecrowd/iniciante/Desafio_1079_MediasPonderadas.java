package src.src.beecrowd.iniciante;

/*
 Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

ENTRADA
 O arquivo de entrada contém um valor inteiro N na primeira linha.
 Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

SAÍDA
 Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1079_MediasPonderadas {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int testes = input.nextInt();

        for(int i = 0; i < testes; i++) {
            double numero1 = input.nextDouble();
            double numero2 = input.nextDouble();
            double numero3 = input.nextDouble();

            double media = ((numero1 * 2) + (numero2 * 3) + (numero3 * 5)) / 10;
            System.out.println(String.format("%.1f", media));
        }
    }
}

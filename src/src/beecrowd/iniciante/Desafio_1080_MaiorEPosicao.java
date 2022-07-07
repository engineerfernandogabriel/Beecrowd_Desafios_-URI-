package src.src.beecrowd.iniciante;

/*
 Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

ENTRADA
 O arquivo de entrada contém 100 números inteiros, positivos e distintos.

SAÍDA
 Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1080_MaiorEPosicao {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int numeroMaior = 0;
        int posicao = 0;
        int numero = 0;

        for (int i = 1; i <= 100; i++) {
            int proximoNumero = input.nextInt();

            if (proximoNumero > numero) {
                numeroMaior = proximoNumero;
                posicao = i;
                numero = proximoNumero;
            }
        }

        System.out.println(numeroMaior);
        System.out.println(posicao);
    }
}

package src.src.beecrowd.iniciante;

/*
 Faça um programa que mostre os números pares entre 1 e 100, inclusive.

ENTRADA
 Neste problema extremamente simples de repetição não há entrada.

SAÍDA
 Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
 */

import java.io.IOException;

public class Desafio_1059_NumerosPares {

    public static void main(String[] args) throws IOException {
        int num = 100;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
 Não há nenhuma entrada neste problema.

SAÍDA
 Imprima a sequencia conforme exemplo abaixo.
 */

import java.io.IOException;

public class Desafio_1098_SequenciaIJ4 {

    public static void main(String[] args) throws IOException {
        double I = 0;

        while (I <= 2) {
            int cont = 0;
            double J = 1 + I;

            while (cont < 3) {
                System.out.println(String.format("I= %.1f  J=%.1f", I, J));
                J++;
                cont++;
            }
            I += 0.2;
        }
    }
}


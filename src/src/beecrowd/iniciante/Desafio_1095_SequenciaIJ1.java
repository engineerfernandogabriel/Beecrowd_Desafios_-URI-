package src.src.beecrowd.iniciante;

/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
 Não há nenhuma entrada neste problema.

SAÍDA
 Imprima a sequencia conforme exemplo abaixo
 */

import java.io.IOException;

public class Desafio_1095_SequenciaIJ1 {

    public static void main(String[] args) throws IOException {
        int I = 1;
        int J = 60;

        for(int i = 0; i <= 12; i++){
            System.out.println("I=" + I + " J=" + J);
            I+=3;
            J-=5;
        }
    }
}

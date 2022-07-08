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

    public static void main(String[] args) throws IOException{
        int I = 0;

        for(int i = 0; i < 2; i++){
            int cont = 0;
            int J = 1;

            while(cont < 3){
                System.out.println("I=" + I + " J=" + J);
                J++;
                cont++;
            }

            double K = 1.2;
            cont = 0;

            while(cont < 3){
                System.out.println("I=" + I + " J=" + K);
                K++;
                cont++;
            }

            I++;
        }
    }
}

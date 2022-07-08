package src.src.beecrowd.iniciante;

/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
 Não há nenhuma entrada neste problema.

SAÍDA
 Imprima a sequencia conforme exemplo abaixo.
 */

import java.io.IOException;

public class Desafio_1097_SequenciaIJ3 {

    public static void main(String[] args) throws IOException{

        int I = 1;
        int J = 7;

        for(int i =0; i < 5; i++){
            int cont = 0;

            while(cont < 3){
                System.out.println("I=" + I + " J=" + J);
                J-= 1;
                cont++;
            }
            I+= 2;
            J+= 5;
        }
    }
}

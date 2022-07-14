package src.src.beecrowd.iniciante;

/*
 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
 Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

ENTRADA
 A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

SAÍDA
 Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1115_Quadrante {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int coordX = input.nextInt();
        int coordY = input.nextInt();

        while(coordX != 0 && coordY !=0){
            if(coordX > 0 && coordY > 0) System.out.println("primeiro");
            else if(coordX < 0 && coordY > 0) System.out.println("segundo");
            else if(coordX < 0 && coordY < 0) System.out.println("terceiro");
            else if(coordX > 0 && coordY < 0) System.out.println("quarto");

            coordX = input.nextInt();
            coordY = input.nextInt();
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Escreva um programa que leia um valor inteiro N.

 N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo.

 Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

SAÍDA
 Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1144_SequenciaLogica {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numberIn = input.nextInt();

        for(int i = 1; i <= numberIn; i++){
            int squarei = (int) Math.pow(i, 2);
            int cubei = (int) Math.pow(i , 3);

            System.out.println(i + " " + squarei + " " + cubei);

            squarei++;
            cubei++;

            System.out.println(i + " " + squarei + " " + cubei);
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Escreva um programa que leia um valor inteiro N (1 < N < 1000).

 Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N.

SAÍDA
 Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1143_QuadradoEAoCubo {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numberIn = input.nextInt();

        for(int i = 1; i <= numberIn; i++){
            int squarei = (int) Math.pow(i, 2);
            int cubei = (int) Math.pow(i, 3);
            System.out.println(i + " " + squarei + " " +  cubei);
        }
    }
}

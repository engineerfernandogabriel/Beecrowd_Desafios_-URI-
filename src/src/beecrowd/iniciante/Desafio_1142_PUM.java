package src.src.beecrowd.iniciante;

/*
 Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N.

SAÍDA
 Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1142_PUM {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numRepeat = input.nextInt();
        int count = 1;

        for(int i = 0; i < numRepeat; i++){
            int number1 = count;
            int number2 = ++count;
            int number3 = ++count;
            System.out.println(number1 + " " + number2 + " " + number3 + " PUM");

            count+= 2;
        }
    }
}

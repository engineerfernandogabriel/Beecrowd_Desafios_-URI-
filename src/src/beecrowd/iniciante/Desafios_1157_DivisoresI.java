package src.src.beecrowd.iniciante;

/*
 Ler um número inteiro N e calcular todos os seus divisores.

ENTRADA
 O arquivo de entrada contém um valor inteiro.

SAÍDA
 Escreva todos os divisores positivos de N, um valor por linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafios_1157_DivisoresI {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int numberDivisor = input.nextInt();

        for(int i = 1; i <= numberDivisor; i++){
            if(numberDivisor % i == 0){
                System.out.println(i);
            }
        }
    }
}

package src.src.beecrowd.iniciante;

/*
 Faça um algoritmo para ler um valor A e um valor N.

 Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1).

 Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

ENTRADA
 A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na mesma linha.

SAíDA
 A saída contém apenas um valor inteiro.
 */

import java.io.IOException;
import java.util.Scanner;

public class Deafio_1149_SomandoInteirosConsecutivos {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int numberA = input.nextInt();
        int numberN = input.nextInt();
        int soma = 0;

        while(numberN <= 0){
            numberN = input.nextInt();
        }

        for (int i = 1; i <= numberN; i++) {
            soma += numberA;
            numberA++;
            }
        System.out.println(soma);
    }
}

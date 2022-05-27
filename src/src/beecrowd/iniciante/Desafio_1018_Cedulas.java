package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

SAÍDA
 Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1018_Cedulas {

    public static void main(String[] args) throws IOException {
        int valor, notas, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        Scanner teclado = new Scanner(System.in);

        valor = teclado.nextInt();

        notas100 = valor / 100;
        notas = valor - (notas100 * 100);

        notas50 = notas / 50;
        notas = notas - (notas50 * 50);

        notas20 = notas / 20;
        notas = notas - (notas20 * 20);

        notas10 = notas / 10;
        notas = notas - (notas10 * 10);

        notas5 = notas / 5;
        notas = notas - (notas5 * 5);

        notas2 = notas / 2;
        notas = notas - (notas2 * 2);

        notas1 = notas;

        teclado.close();

        System.out.println(valor);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}

package src.src.beecrowd.iniciante;

/*
 Leia um valor de ponto flutuante com duas casas deci mais.
 Este valor representa um valor monetário.
 A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
 A seguir mostre a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAÍDA
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1021_NotasEMoedas {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();

        int valorNotas = (int) (valor / 1);
        int valorMoedas = (int) ((valor - valorNotas) * 100);

        //NOTAS -> usar a variável valorInt
        int notas100 = valorNotas / 100;

        teclado.close();

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota (s) de R$ 100.00");

    }
}

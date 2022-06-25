package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

ENTRADA
 A entrada contém um valor inteiro N (5 < N < 2000).

SAÍDA
 Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
 Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada.
 Neste caso, configure a precisão adequadamente para que isso não ocorra.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1073_QuadradoDePares {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int numeroBase = input.nextInt();

        for (int i = 2 ; i <= numeroBase; i += 2){
            if(i % 2 == 0) {
                int quadradoNumero = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + quadradoNumero);
            }

        }
    }
}

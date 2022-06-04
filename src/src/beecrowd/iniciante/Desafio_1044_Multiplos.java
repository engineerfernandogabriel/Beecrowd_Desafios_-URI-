package src.src.beecrowd.iniciante;

/*
 Leia 2 valores inteiros (A e B).
 Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

ENTRADA
 A entrada contém valores inteiros.

SAÍDA
 A saída deve conter uma das mensagens conforme descrito acima.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1044_Multiplos {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();

        teclado.close();
        if ((a % b) == 0 || (b % a) == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

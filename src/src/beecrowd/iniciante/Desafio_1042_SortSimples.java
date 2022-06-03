package src.src.beecrowd.iniciante;

/*
 Leia 3 valores inteiros e ordene-os em ordem crescente.
 No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

ENTRADA
 A entrada contem três números inteiros.

SAÍDA
 Imprima a saída conforme foi especificado.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio_1042_SortSimples {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);

        teclado.close();

        Collections.sort(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}

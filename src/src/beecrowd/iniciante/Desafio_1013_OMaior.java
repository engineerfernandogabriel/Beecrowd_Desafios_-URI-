package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
 Utilize a fórmula:
    MaiorAB = ( a + b + abs(a-b)) / 2

 Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
 O arquivo de entrada contém três valores inteiros.

SAÍDA
 Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1013_OMaior {

    public static void main(String[] args) throws IOException {
        int a, b, s, maiorNumero;

        Scanner leitor = new Scanner(System.in);

        a = leitor.nextInt();
        b = leitor.nextInt();
        s = leitor.nextInt();

        if (a > b){
            maiorNumero = a;
        } else {
            maiorNumero = b;
        }

        if (maiorNumero > s){
            maiorNumero = maiorNumero;
        } else{
            maiorNumero = s;
        }

        leitor.close();

        System.out.println(maiorNumero + " eh o maior");
    }
}

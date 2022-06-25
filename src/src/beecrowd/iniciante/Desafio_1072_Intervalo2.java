package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

ENTRADA
 A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

SAÍDA
 Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1072_Intervalo2 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int numeroTestes = input.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < numeroTestes; i++) {
            int x = input.nextInt();

            if(x >=10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}

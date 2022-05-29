package src.src.beecrowd.iniciante;

/*
 Leia 4 valores inteiros A, B, C e D.
 A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

ENTRADA
 Quatro números inteiros A, B, C e D.

SAÍDA
 Mostre a respectiva mensagem após a validação dos valores.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1035_TesteDeSelecao1 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        int somaCD = C + D;
        int somaAB = A + B;

        boolean parA = false;
        if (A % 2 == 0){
            parA = true;
        }

        if(B > C && D > A && somaCD > somaAB && C >= 0 && D >= 0 && parA){
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores não aceitos");
        }

        teclado.close();
    }
}

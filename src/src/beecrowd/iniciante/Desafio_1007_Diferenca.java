package src.src.beecrowd.iniciante;

/*
 Leia quatro valores inteiros A, B, C e D.
 A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

ENTRADA
 O arquivo de entrada contém 4 valores inteiros.

SAÍDA
 Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1007_Diferenca {

    public static void main(String[] args) throws IOException{
        int A, B, C, D, diferenca, produtoAb, produtoCd;

        Scanner leitor = new Scanner(System.in);

        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        produtoAb = A * B;
        produtoCd = C * D;

        diferenca = produtoAb - produtoCd;

        leitor.close();

        System.out.println("DIFERENCA = " + diferenca);
    }
}

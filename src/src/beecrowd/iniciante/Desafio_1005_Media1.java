package src.src.beecrowd.iniciante;

/*
 Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
 A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
 Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

ENTRADA
 O arquivo de entrada contém 2 valores com uma casa decimal cada um.

SAÍDA
 Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um
espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1005_Media1 {

    public static void main(String[] args) throws IOException {
        double A, B, media, notaA, notaB;

        Scanner leitor = new Scanner(System.in);

        A = leitor.nextDouble();
        B = leitor.nextDouble();

        notaA = A * 3.5;
        notaB = B * 7.5;

        media = (notaA + notaB) / 11;

        leitor.close();

        System.out.println(String.format("MEDIA = %.5f", media));
    }
}

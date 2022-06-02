package src.src.beecrowd.iniciante;

/*
 Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
 Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ".
 Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
 Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
 Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

 No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
 Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
 Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado."
(caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

ENTRADA
 A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

SAÍDA
 Todas as respostas devem ser apresentadas com uma casa decimal.
 As mensagens devem ser impressas conforme a descrição do problema.
 Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1040_Media3 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        double nota4 = teclado.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10.0;

        if(media >= 7){
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno aprovado.");
        }else if (media < 7 && media >= 5){
            double notaExame = teclado.nextDouble();
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + notaExame);
            double mediaFinal = (media + notaExame) / 2;

            if (mediaFinal > 5){
                System.out.println("Aluno aprovado.");
                System.out.println(String.format("Media final: %.1f", mediaFinal));
            } else {
                System.out.println("Aluno reprovado");
            }
        }else {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno reprovado.");
        }

        teclado.close();
    }
}

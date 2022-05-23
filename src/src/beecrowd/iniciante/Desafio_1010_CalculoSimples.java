package src.src.beecrowd.iniciante;

/*
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
 O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

SAÍDA
 A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos
e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1010_CalculoSimples {

    public static void main(String[] args) throws IOException {
        int codPeca1, numeroPecas1, codPeca2, numeroPecas2;
        double valorUnitario1, valorUnitario2, valorPagarPeca1, valorPagarPeca2, valorPagarTotal;

        Scanner leitor = new Scanner(System.in);

        codPeca1 = leitor.nextInt();
        numeroPecas1 = leitor.nextInt();
        valorUnitario1 = leitor.nextDouble();

        codPeca2 = leitor.nextInt();
        numeroPecas2 = leitor.nextInt();
        valorUnitario2 = leitor.nextDouble();

        valorPagarPeca1 = numeroPecas1 * valorUnitario1;
        valorPagarPeca2 = numeroPecas2 * valorUnitario2;

        valorPagarTotal = valorPagarPeca1 + valorPagarPeca2;

        leitor.close();

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorPagarTotal));
    }
}

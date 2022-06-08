package src.src.beecrowd.iniciante;

/*
 A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

    Salário	Percentual de Reajuste
      0 - 400.00              15%
      400.01 - 800.00         12%
      800.01 - 1200.00        10%
      1200.01 - 2000.00        7%
      Acima de 2000.00         4%

 Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

ENTRADA
 A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAÍDA
 Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1048_AumentoDeSalario {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        double salarioAtual = teclado.nextDouble();
        teclado.close();

        double novoSalario = 0;

        if(salarioAtual <= 400){
            novoSalario = salarioAtual * 1.15;
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", (novoSalario - salarioAtual)));
            System.out.println("Em percentual: 15 %");
        } else if(salarioAtual > 400 && salarioAtual <= 800){
            novoSalario = salarioAtual * 1.12;
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", (novoSalario - salarioAtual)));
            System.out.println("Em percentual: 12 %");
        } else if(salarioAtual > 800 && salarioAtual <= 1200){
            novoSalario = salarioAtual * 1.1;
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", (novoSalario - salarioAtual)));
            System.out.println("Em percentual: 10 %");
        } else if(salarioAtual > 1200 && salarioAtual <= 2000){
            novoSalario = salarioAtual * 1.07;
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", (novoSalario - salarioAtual)));
            System.out.println("Em percentual: 7 %");
        } else{
            novoSalario = salarioAtual * 1.04;
            System.out.println(String.format("Novo salario: %.2f", novoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", (novoSalario - salarioAtual)));
            System.out.println("Em percentual: 4 %");
        }
    }
}

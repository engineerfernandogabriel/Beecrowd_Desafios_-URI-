package src.src.beecrowd.iniciante;

/*
 Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável.

 Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

 Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente
o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

ENTRADA
 A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.

 Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

SAíDA
 Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de
cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1094_Experiencias {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int numberTests = input.nextInt();
        int total = 0;
        int totalRabbits = 0;
        int totalRats = 0;
        int totalFrogs = 0;
        double percentualRabbits = 0.0;
        double percentualRats = 0.0;
        double percentualFrogs = 0.0;

        for(int i = 0; i < numberTests; i++){
            int subTotalTest = input.nextInt();
            String typeTest = input.next();

            if(typeTest.equalsIgnoreCase("c")) totalRabbits += subTotalTest;
            else if(typeTest.equalsIgnoreCase("R")) totalRats  += subTotalTest;
            else if(typeTest.equalsIgnoreCase("S")) totalFrogs  += subTotalTest;

            total += subTotalTest;
        }

        percentualRabbits = ((double) totalRabbits / total ) * 100;
        percentualRats = ((double) totalRats / total) * 100;
        percentualFrogs = ((double) totalFrogs / total) * 100;

        System.out.printf("Total: %d cobaias %n", total);
        System.out.printf("Total de coelhos: %d %n", totalRabbits);
        System.out.printf("Total de ratos: %d %n", totalRats);
        System.out.printf("Total de sapos: %d %n", totalFrogs);
        System.out.printf("Percentual de coelhos: %.2f %% %n", percentualRabbits);
        System.out.printf("Percentual de ratos: %.2f %% %n", percentualRats);
        System.out.printf("Percentual de sapos: %.2f %%", percentualFrogs);

    }
}

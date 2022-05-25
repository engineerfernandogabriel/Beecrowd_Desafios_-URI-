package src.src.beecrowd.iniciante;

/*
 Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule
a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = ((x2 - x1)^2 + (y2-y1)^2)^1/2

ENTRADA
 O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante:
x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

SAÍDA
 Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1015_DistanciaEntreDoisPontos {

    public static void main(String[] args) throws IOException {
        double distancia, x1, x2, y1, y2;

        Scanner leitor = new Scanner(System.in);

        x1 = leitor.nextDouble();
        y1 = leitor.nextDouble();
        x2 = leitor.nextDouble();
        y2 = leitor.nextDouble();

        // ((x2 - x1)^2 + (y2-y1)^2)^1/2
        distancia = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));

        leitor.close();

        System.out.println(String.format("%.4f", distancia));

    }
}

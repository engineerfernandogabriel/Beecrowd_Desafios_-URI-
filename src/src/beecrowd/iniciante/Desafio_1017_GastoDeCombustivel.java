package src.src.beecrowd.iniciante;

/*
 Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
 Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na
viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos
litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

ENTRADA
 O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

SAÍD
 Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1017_GastoDeCombustivel {

    public static void main(String[] args) throws IOException {
        int tempoViagem, velocidadeMedia;
        double quantidadeLitros, distanciaPercorrida;

        Scanner teclado = new Scanner(System.in);

        tempoViagem = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();

        distanciaPercorrida = tempoViagem * velocidadeMedia;

        quantidadeLitros = distanciaPercorrida / 12.0;

        teclado.close();

        System.out.println(String.format("%.3f", quantidadeLitros));
    }
}

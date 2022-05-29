package src.src.beecrowd.iniciante;

/*
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
 Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

ENTRADA
 Leia três valores de ponto flutuante (double) A, B e C.

SAÍDA
 Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
 Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
 Imprima sempre o final de linha após cada mensagem.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1036_FormulaDeBhaskara {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        teclado.close();

        //formula delta = b^2 - (4 * a * c)
        double delta = Math.pow(b,2) - (4 * a * c);

        if(delta >= 0 && a != 0){
            double r1 = ((-b) + Math.sqrt(delta)) / (2*a);
            double r2 = ((-b) - Math.sqrt(delta)) / (2*a);

            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        } else{
            System.out.println("Impossível calcular");
        }
    }
}

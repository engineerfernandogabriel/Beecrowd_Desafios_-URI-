package src.src.beecrowd.iniciante;

/*
 Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
 Em seguida, calcule e mostre:
  a) a área do triângulo retângulo que tem A por base e C por altura.
  b) a área do círculo de raio C. (pi = 3.14159)
  c) a área do trapézio que tem A e B por bases e C por altura.
  d) a área do quadrado que tem lado B.
  e) a área do retângulo que tem lados A e B.

ENTRADA
 O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAÍDA
 O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com
mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1012_Area {

    public static void main(String[] args) throws IOException {
        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Scanner leitor = new Scanner(System.in);

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        // (base * altura )/ 2
        areaTriangulo = (A * C) / 2;

        // pi * r^2
        areaCirculo = 3.14159 * C * C;

        // (Base maior + base menor) * altura ) / 2
        areaTrapezio = ((A + B) * C) / 2;

        // lado^2
        areaQuadrado = B * B;

        // lado * lado
        areaRetangulo = A * B;

        leitor.close();

        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));



    }
}

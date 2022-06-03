package src.src.beecrowd.iniciante;

/*
 Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

 Perimetro = XX.X

 Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

 Area = XX.X

ENTRADA
 A entrada contém três valores reais.

SAÍDA
 O resultado deve ser apresentado com uma casa decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1043_Triangulo {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        double reta1 = teclado.nextDouble();
        double reta2 = teclado.nextDouble();
        double reta3 = teclado.nextDouble();

        teclado.close();

        if(Math.abs(reta1 - reta2) < reta3 && reta3 < (reta1 + reta2)){
            double perimetro = reta1 + reta2 + reta3;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else{
            double area = ((reta1 + reta2) * reta3) / 2;
            System.out.println(String.format("Area = %.1f", area));
        }
    }
}

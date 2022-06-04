package src.src.beecrowd.iniciante;

/*
 Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
 A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

ENTRADA
 A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

SAÍDA
 Imprima todas as classificações do triângulo especificado na entrada.
 */

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio_1045_TiposDeTriangulos {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        teclado.close();

        List<Double> ordemDecrescente = new ArrayList<Double>();
        ordemDecrescente.add(a);
        ordemDecrescente.add(b);
        ordemDecrescente.add(c);

        Collections.sort(ordemDecrescente);

        List<Double> ordemCrescente = new ArrayList<Double>();

        System.out.println(ordemDecrescente);
        for (int i = 0; i < ordemDecrescente.size(); i++) {
            System.out.println(ordemCrescente[i - i - 1]);

//
//        if (a >= (b + c)){
//            System.out.println("NAO FORMA TRIANGULO");
//        }
//
//        if (Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2))){
//            System.out.println("TRIANGULO RENTAGULO");
//        }
//
//        if(Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2))){
//            System.out.println("TRIANGULO OBTUSANGULO");
//        }
//
//        if(Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2))){
//            System.out.println("TRIANGULO ACUTANGULO");
//        }
//
//        if(a == b && b == c){
//            System.out.println("TRIANGULO EQUILATERO");
//        }
//
//        if(a == b && a != c ){
//            System.out.println("TRIANGULO ISOSCELES");
//        }else if(b == c && b != a){
//            System.out.println("TRIANGULO ISOSCELES");
//        }else if(c == a && b != c){
//            System.out.println("TRIANGULO ISOSCELES");
//        }
    }
}


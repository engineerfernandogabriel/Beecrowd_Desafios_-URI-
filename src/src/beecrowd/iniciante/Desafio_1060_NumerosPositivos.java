package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
 A seguir, mostre a quantidade de valores positivos digitados.

ENTRADA
 Seis valores, negativos e/ou positivos.

SAÍDA
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_1060_NumerosPositivos {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        double valor1 = teclado.nextDouble();
        double valor2 = teclado.nextDouble();
        double valor3 = teclado.nextDouble();
        double valor4 = teclado.nextDouble();
        double valor5 = teclado.nextDouble();
        double valor6 = teclado.nextDouble();

        List<Double> numeros = new ArrayList<>();
        numeros.add(valor1);
        numeros.add(valor2);
        numeros.add(valor3);
        numeros.add(valor4);
        numeros.add(valor5);
        numeros.add(valor6);

        int numerosPositivos = 0;

        for(int i = 0; i< numeros.size(); i++ ){
            if(numeros.get(i) > 0){
                numerosPositivos++;
            }
        }

        System.out.println(numerosPositivos + " valores positivos");

    }
}

//__________________________________________________________________________________________________________
// Uma abordagem mais simplificada;
//    public static void main(String[] args) throws IOException {
//        Scanner leitor = new Scanner(System.in);
//        int cont = 0;
//        for (int i=0; i < 6; i++) {
//            double n = leitor.nextDouble();
//            if (n > 0) cont++;
//        }
//        System.out.println(cont + " valores positivos");
//    }
//
//}

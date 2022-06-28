package src.src.beecrowd.iniciante;

/*
 Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

ENTRADA
 O arquivo de entrada contém dois valores inteiros.

SAÍDA
 O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1071_SomaDeImparesConsecutivosI {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;

        if(x > y){
            maior = x;
            menor = y;
        } else{
            menor = x;
            maior = y;
        }

        if(menor % 2 !=0){
            soma = menor * (-1);
            for(int i = menor; i < maior; i += 2) {
                soma += i;
            }
        }else{
            menor++;
            for(int i = menor; i < maior; i += 2) {
                soma += menor;
            }
        }

        System.out.println(soma);
    }
}

package src.src.beecrowd.iniciante;

/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar.

 CODIGO		ESPECIFICACAO		PREÇO
 1			Cachorro Quente		R$ 4,00
 2			X-salada			R$ 4,50
 3			X-bacon				R$ 5,00
 4			Torrada Simples		R$ 2,00
 5			Refrigerante		R$ 1,50

ENTRADA
 O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

SAÍDA
 O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1038_Lanche {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        int codigoLanche = teclado.nextInt();
        int quantidadeLanche = teclado.nextInt();
        double valor = 0;

        teclado.close();

        if(codigoLanche == 1){
            valor = quantidadeLanche * 4.00;
        } else if(codigoLanche == 2){
            valor = quantidadeLanche * 4.50;
        } else if(codigoLanche == 3){
            valor = quantidadeLanche * 5.00;
        } else if(codigoLanche == 4){
            valor = quantidadeLanche * 2.00;
        } else if(codigoLanche == 5){
            valor = quantidadeLanche * 1.00;
        }

        System.out.println(String.format("Total: R$ %.2f", valor));
    }
}

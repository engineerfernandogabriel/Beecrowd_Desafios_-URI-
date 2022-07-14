package src.src.beecrowd.iniciante;

/*
 Faça um programa que leia as notas referentes às duas avaliações de um aluno.

 Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).

 Cada nota deve ser validada separadamente.

ENTRADA
 A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

SAÍDA
 Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".

 Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.

 valor deve ser apresentado com duas casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1117_ValidacaoDeNota {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        double nota1 = 0.0;
        double nota2 = 0.0;
        String notaInvalida = "nota invalida";

        while(notaInvalida.equalsIgnoreCase("nota invalida")){
            double number1 = input.nextDouble();

            if(number1 >= 0 && number1 <= 10){
                nota1 = number1;
                notaInvalida = "nota valida";
            } else{
                System.out.println("nota invalida");
                notaInvalida = "nota invalida";
            }
        }

        notaInvalida = "nota invalida";

        while(notaInvalida.equalsIgnoreCase("nota invalida")){
            double number2 = input.nextDouble();

            if(number2 >= 0 && number2 <= 10){
                nota2 = number2;
                notaInvalida = "nota valida";
            } else{
                System.out.println("nota invalida");
                notaInvalida = "nota invalida";
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.println("media = " + media);
    }
}

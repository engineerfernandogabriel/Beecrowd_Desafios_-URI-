package src.src.beecrowd.iniciante;

/*
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.

 Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).

 Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).

 O programa será encerrado quando o código informado for o número 4.

ENTRADA
 A entrada contém apenas valores inteiros e positivos.

SAÍDA
 Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1134_TipoDeCombustivel {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int number = 0;

        do {
            number = input.nextInt();

            if (number == 1) alcool++;
            else if (number == 2) gasolina++;
            else if (number == 3) diesel++;
        }while(number != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}

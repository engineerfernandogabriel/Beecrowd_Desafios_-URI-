package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

 Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
 O arquivo de entrada contém um valor inteiro.

SAÍDA
 Imprima a saída conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1020_IdadeEmDias {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        int idadeEmDias = teclado.nextInt();

        int ano = idadeEmDias / 365;
        int idade = idadeEmDias - (ano*365);
        int meses = idade / 30;
        int dias = idade - (meses*30);;

        teclado.close();

        System.out.println(ano + " ano (s)");
        System.out.println(meses + " mes (es)");
        System.out.println(dias + " dia (s)");
    }
}


package src.src.beecrowd.iniciante;

/*
 Escreva um programa que repita a leitura de uma senha até que ela seja válida.

 Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".

 Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.

 Considere que a senha correta é o valor 2002.

ENTRADA
 A entrada é composta por vários casos de testes contendo valores inteiros.

SAÍDA
 Para cada valor lido mostre a mensagem correspondente à descrição do problema.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1114_SenhaFixa {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int password = 2002;
        int testPassword = 0;

        do {
            testPassword = input.nextInt();

            System.out.println((password == testPassword) ? "Acesso Permitido" : "Senha Invalida");
        } while (testPassword != 2002);
    }
}

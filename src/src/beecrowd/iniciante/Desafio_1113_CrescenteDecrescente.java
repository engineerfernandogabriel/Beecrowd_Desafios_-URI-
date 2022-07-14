package src.src.beecrowd.iniciante;

/*
 Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.

 Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

ENTRADA
 A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.

 A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

SAÍDA
 Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1113_CrescenteDecrescente {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;

        do {
            x = input.nextInt();
            y = input.nextInt();

                if (x != y) {
                    if(x > y) System.out.println("Decrescente");
                    else System.out.println("Crescente");
            }
        } while (x != y) ;
    }
}

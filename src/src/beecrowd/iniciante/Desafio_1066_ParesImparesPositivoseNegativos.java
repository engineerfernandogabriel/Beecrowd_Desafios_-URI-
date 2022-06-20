package src.src.beecrowd.iniciante;

/*
 Leia 5 valores Inteiros.
 A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

SAÍDA
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1066_ParesImparesPositivoseNegativos {

    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);

        int contPositivos = 0;
        int contNegativos = 0;
        int contPares = 0;
        int contImpares = 0;

        for(int i =0; i < 5; i++){
            int n = scan.nextInt();

            if(n % 2 == 0){
                contPares++;
            }else {
                contImpares++;
            }

            if(n > 0){
                contPositivos++;
            } else if (n < 0){
                contNegativos++;
            }
        }

        System.out.println(contPares + " valor(es) par(es)");
        System.out.println(contImpares + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println((contNegativos + " valor(es) negativo(s)"));
   }
}

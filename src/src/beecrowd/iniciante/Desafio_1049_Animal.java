package src.src.beecrowd.iniciante;

/*
 Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.
 Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

ENTRADA
 A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

SAÍDA
 Imprima o nome do animal correspondente à entrada fornecida
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1049_Animal {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        String palavra1 = teclado.next();
        String palavra2 = teclado.next();
        String palavra3 = teclado.next();

        if(palavra1.equalsIgnoreCase("vertebrado")){
            if(palavra2.equalsIgnoreCase("ave")){
                if(palavra3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("pomba");
                }
            } else if(palavra2.equalsIgnoreCase("mamifero")){
                if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else if(palavra3.equalsIgnoreCase("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(palavra1.equalsIgnoreCase("invertebrado")){
            if(palavra2.equalsIgnoreCase("inseto")){
                if(palavra3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else if(palavra3.equalsIgnoreCase("herbivoro")){
                    System.out.println("lagarta");
                }
            } else if(palavra2.equalsIgnoreCase("anelideo")){
                if(palavra3.equalsIgnoreCase("hematofogo")){
                    System.out.println("sanguessuga");
                } else if(palavra3.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}

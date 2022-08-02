package src.src.beecrowd.iniciante;

/*
 Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

 Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

ENTRADA
 Quatro números inteiros representando a hora de início e fim do jogo.

SAÍDA
 Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1047_TempoDeJogoComMinutos {

    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        int initialHour = input.nextInt();
        int initialMinute = input.nextInt();
        int finalHour = input.nextInt();
        int finalMinute = input.nextInt();

        int totalMinutes = finalMinute - initialMinute;

        int totalHour = finalHour - initialHour;

        if(totalHour < 0){
            totalHour = 24 + (finalHour - initialHour);
        }

        if(totalMinutes < 0){
            totalMinutes = 60 + (finalMinute - initialMinute);
            totalHour--;
        }

        if(initialHour == initialHour && initialMinute == initialHour){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else{
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totalHour, totalMinutes);
        }
    }
}

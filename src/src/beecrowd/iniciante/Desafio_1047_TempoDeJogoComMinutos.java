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

        int horas = 0;
        int minutos = 0;

        int initialHour = input.nextInt();
        int initialMinute = input.nextInt();
        int finalHour = input.nextInt();
        int finalMinute = input.nextInt();

        int totalMinutes = (60 - initialMinute) + finalMinute;

        int totalHour = finalHour - initialHour;

        if(((60 - initialMinute) + finalMinute) >= 60){
            minutos = ((60 - initialMinute) + finalMinute) - 60;
        }else {
            minutos = (60 - initialMinute) + finalMinute;
        }

        if(finalHour - initialHour > 0 && finalMinute < initialMinute){
            horas = 0;
        } else if(finalHour - initialHour > 1){
            horas = finalHour - initialHour;
        }else if(finalHour - initialHour == 0){
            horas = 24;
        }

      System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos);
    }
}

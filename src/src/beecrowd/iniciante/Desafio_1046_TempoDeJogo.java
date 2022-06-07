package src.src.beecrowd.iniciante;

/*
 Leia a hora inicial e a hora final de um jogo.
 A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

ENTRADA
 A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

SAÍDA
 Apresente a duração do jogo conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1046_TempoDeJogo {

    public static void main(String[] args) throws IOException{

        Scanner teclado = new Scanner(System.in);

        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();

        teclado.close();

        int tempoDuracao = 0;

        if(horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA (S)");
        } else if(horaInicial > horaFinal){
            tempoDuracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA (S)");
        } else if (horaInicial < horaFinal) {
            tempoDuracao = (horaFinal - horaInicial);
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA (S)");
        }
    }
}

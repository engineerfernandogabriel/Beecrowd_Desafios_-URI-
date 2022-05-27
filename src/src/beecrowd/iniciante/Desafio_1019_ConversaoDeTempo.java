package src.src.beecrowd.iniciante;

/*
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

ENTRADA
 O arquivo de entrada contém um valor inteiro N.

SAÍDA
 Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1019_ConversaoDeTempo {

    public static void main(String[] args) throws IOException {
        int tempoDuracaoSegundos, tempo, horas, minutos, segundos;

        Scanner teclado = new Scanner(System.in);

        tempoDuracaoSegundos = teclado.nextInt();

        horas = tempoDuracaoSegundos / 3600;
        tempo = tempoDuracaoSegundos - (horas * 3600);

        minutos = tempo / 60;
        tempo = tempo - (minutos * 60);

        segundos = tempo;

        teclado.close();

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}

package src.src.beecrowd.iniciante;

/*
 Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês.
 O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
 Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

ENTRADA
 Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar.
 Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss.
 Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

SAÍDA
 Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1061_TempoDeUmEvento {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String nomeDiaInicial = input.next();
        int diaInicial = input.nextInt();
        int horaInicial = input.nextInt();
        int minutoInicial = input.nextInt();
        int segundoInicial = input.nextInt();

        String nomeDiaFinal = input.next();
        int diaFinal = input.nextInt();
        int horaFinal = input.nextInt();
        int minutoFinal = input.nextInt();
        int segundoFinal = input.nextInt();

        int horas = (24 - horaInicial) + horaFinal;
        int minutos = minutoFinal - minutoInicial;
        int segundos = segundoFinal - segundoInicial;
        int dia = (diaFinal - diaInicial) - 1;

        System.out.println(dia + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}

package Eassociacao.test;

import Eassociacao.domain.Jogador;
import Eassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}

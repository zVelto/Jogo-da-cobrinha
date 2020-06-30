package jogo;

import java.util.Scanner;
import jogo.enums.Direcao;
import jogo.enums.Referencia;

public class Comandos {
    
    public static void botoesDeComando(Cobrinha cobrinha, Partida partida, Scanner input) {
     
        //System.out.println(cobrinha.getCabeca().getDirecao());
        String comando = input.nextLine();
        comando = comando.toUpperCase();
        char direcao = comando.charAt(0);

        if(direcao == 'W') {
            cobrinha.getCabeca().setDirecao(Direcao.CIMA);
            //System.out.print(cobrinha.getCabeca().getDirecao());
        }

        if(direcao == 'A') {
            cobrinha.getCabeca().setDirecao(Direcao.ESQUERDA);
            //System.out.print(cobrinha.getCabeca().getDirecao());
        }

        if(direcao == 'S') {
            cobrinha.getCabeca().setDirecao(Direcao.BAIXO);
            //System.out.print(cobrinha.getCabeca().getDirecao());
        }
        if(direcao == 'D') {
            cobrinha.getCabeca().setDirecao(Direcao.DIREITA);
            //System.out.print(cobrinha.getCabeca().getDirecao());
        }

        if(direcao == 'B') {
            partida.setEstado(0);
        }

        if(cobrinha.getCabeca().getDirecao() == Direcao.CIMA) {
            cobrinha.getCabeca().setPosicao(new Posicao(cobrinha.getCabeca().getPosicao().getCoordenadaX() - 1, cobrinha.getCabeca().getPosicao().getCoordenadaY(), Referencia.CAMPO));
        }

        if(cobrinha.getCabeca().getDirecao() == Direcao.BAIXO) {
            cobrinha.getCabeca().setPosicao(new Posicao(cobrinha.getCabeca().getPosicao().getCoordenadaX() + 1, cobrinha.getCabeca().getPosicao().getCoordenadaY(), Referencia.CAMPO));
        }

        if(cobrinha.getCabeca().getDirecao() == Direcao.ESQUERDA) {
            cobrinha.getCabeca().setPosicao(new Posicao(cobrinha.getCabeca().getPosicao().getCoordenadaX(), cobrinha.getCabeca().getPosicao().getCoordenadaY() - 1, Referencia.CAMPO));
        }

        if(cobrinha.getCabeca().getDirecao() == Direcao.DIREITA) {
            cobrinha.getCabeca().setPosicao(new Posicao(cobrinha.getCabeca().getPosicao().getCoordenadaX(), cobrinha.getCabeca().getPosicao().getCoordenadaY() + 1, Referencia.CAMPO));
        }
        
        
    }  
}

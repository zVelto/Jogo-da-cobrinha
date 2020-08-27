package aplicação;

import interfaceVisual.impressorDeCampo;
import java.util.Scanner;
import jogo.Campo;
import jogo.Cobrinha;
import jogo.Comandos;
import jogo.Partida;
import jogo.Posicao;
import jogo.enums.Referencia;

public class Start {

    
    public static void main(String[] args) {
        Partida partida = new Partida();
        partida.setEstado(1);
        Cobrinha cobrinha = new Cobrinha(1, new Posicao(10, 10, Referencia.CAMPO));
        Campo campo = new Campo(0, cobrinha, 20, 20, new Posicao(0, 0, Referencia.TELA));
        campo.criarParede();
        Scanner input = new Scanner(System.in);
        
        while(partida.getEstado() == 1) {
            impressorDeCampo.imprimirParede(campo, cobrinha);
            Comandos.botoesDeComando(cobrinha, partida, input);
        }
        input.close();
    }
    
}

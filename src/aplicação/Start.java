package aplicação;

import interfaceVisual.impressorDeCampo;
import interfaceVisual.impressorDePartida;
import jogo.Campo;

public class Start {

    
    public static void main(String[] args) {
        Campo campo = new Campo(0, null, 20, 20, null);
        campo.criarParede();
        impressorDeCampo.imprimirParede(campo);
    }
    
}

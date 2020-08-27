package interfaceVisual;

import jogo.Campo;
import jogo.Cobrinha;

public class impressorDeCampo {
    
    
    public static void imprimirParede(Campo campo, Cobrinha cobrinha) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        for(int i = 0; i < campo.getLargura(); i++) {
            for(int j = 0; j < campo.getAltura(); j++) {
                if(campo.getParede()[i][j] != null) {
                    System.out.print(campo.getParede()[i][j] + " ");
                }
                else if(impressorDePersonagem.imprimirCobrinha(i, j, cobrinha)){
                    
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

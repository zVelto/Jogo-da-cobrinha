package interfaceVisual;

import jogo.Campo;

public class impressorDeCampo {
    
    
    public static void imprimirParede(Campo campo) {
        for(int i = 0; i < campo.getLargura(); i++) {
            for(int j = 0; j < campo.getAltura(); j++) {
                if(campo.getParede()[i][j] != null) {
                    System.out.print(campo.getParede()[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

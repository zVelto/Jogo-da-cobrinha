package interfaceVisual;

import jogo.Cobrinha;
import jogo.Membro;

public class impressorDePersonagem {
       
    public static boolean imprimirCobrinha(int coordenadaX, int coordenadaY, Cobrinha cobrinha) {
        
        for(Membro membro : cobrinha.getMembros().values()) {
            if(membro.getPosicao().getCoordenadaX() == coordenadaX && membro.getPosicao().getCoordenadaY() == coordenadaY) {
                System.out.print(membro + " ");
                return true;
            } 
        }
        return false;
    }
    
}

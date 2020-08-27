package interfaceVisual;

public class impressorDePartida {
    
    
    public static void tela() {
        
        int distanciaTopo = 5;
        int distanciaEsquerda = 20;
        System.out.println("\033[H\033[2J");
        for(int i = 0; i < distanciaTopo; i++) {
            System.out.println("\n");
        }
        for(int i = 0; i < distanciaEsquerda; i++) {
            System.out.print(" ");
        }
        
        System.out.println("inicio");
    }
}

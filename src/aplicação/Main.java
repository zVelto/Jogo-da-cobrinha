package aplicação;

import interfaceGrafica.Tela;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        Tela tela = new Tela();
        tela.setVisible(true);
        tela.setBounds(250, 250, 500, 500);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

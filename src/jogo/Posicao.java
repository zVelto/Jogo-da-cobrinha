package jogo;

import jogo.enums.Referencia;

public class Posicao {
    
    private int coordenadaX;
    private int coordenadaY;
    private Referencia referencia;

    public Posicao(int coordenadaX, int coordenadaY, Referencia referencia) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.referencia = referencia;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }
    
    
}

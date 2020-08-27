package jogo;

import jogo.enums.Direcao;

public class Membro {
    
    private String corpo;
    private Posicao posicao;
    private Direcao direcao;

    public Membro(String corpo, Posicao posicao, Direcao direcao) {
        this.corpo = corpo;
        this.posicao = posicao;
        this.direcao = direcao;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return corpo;
    }
}

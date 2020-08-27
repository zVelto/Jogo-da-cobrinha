package jogo;

public class Barreira {
    
    private String corpo;
    private Posicao posicao;

    public Barreira(String corpo, Posicao posicao) {
        this.corpo = corpo;
        this.posicao = posicao;
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

    @Override
    public String toString() {
        return corpo;
    }
    
    
}

package jogo;

public class Personagem {
    private int tamanho;
    private Posicao posicao;

    public Personagem(int tamanho, Posicao posicao) {
        this.tamanho = tamanho;
        this.posicao = posicao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    
}

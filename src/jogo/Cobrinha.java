package jogo;

public class Cobrinha extends Personagem {
    
    private Double velocidade;

    public Cobrinha(int tamanho, Posicao posicao) {
        super(tamanho, posicao);
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }
    
}

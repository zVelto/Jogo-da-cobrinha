package jogo;

import java.util.HashMap;
import java.util.Map;
import jogo.enums.Direcao;

public class Cobrinha extends Personagem {
    
    private Double velocidade;
    private Direcao direcao;
    private Membro cabeca;
    private Map<Integer, Membro> membros = new HashMap<>();

    public Cobrinha(int tamanho, Posicao posicao) {
        super(tamanho, posicao);
        direcao = Direcao.CIMA;
        cabeca = new Membro("O", posicao, direcao);
        membros.put(1, cabeca);
        velocidade = 2.0;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public Membro getCabeca() {
        return cabeca;
    }

    public void setCabeca(Membro cabeca) {
        this.cabeca = cabeca;
    }

    public Map<Integer, Membro> getMembros() {
        return membros;
    }
    
    
    
}

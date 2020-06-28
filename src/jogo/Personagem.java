package jogo;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private int tamanho;
    private List<Membro> membros = new ArrayList<>();
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

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    
}

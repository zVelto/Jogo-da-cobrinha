package jogo;

import jogo.enums.Referencia;

public class Campo {
    
    private int nivel;
    private Personagem personagem;
    private Barreira[][] parede;
    private int largura;
    private int altura;
    private Posicao posicao;

    public Campo(int nivel, Personagem personagem, int largura, int altura, Posicao posicao) {
        this.nivel = nivel;
        this.personagem = personagem;
        this.largura = largura;
        this.altura = altura;
        this.posicao = posicao;
        parede = new Barreira[largura][altura];
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Barreira[][] getParede() {
        return parede;
    }

    public void setParede(Barreira[][] parede) {
        this.parede = parede;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void criarParede() {
        for(int i = 0; i < getLargura(); i++) {
            for(int j = 0; j < getAltura(); j++) {
                if(i == 0 || i == (getLargura() - 1) || j == 0 || j == (getAltura() - 1)) {
                    parede[i][j] = new Barreira("H", new Posicao(i, j, Referencia.CAMPO));
                }
            }
        }
    }
    
}

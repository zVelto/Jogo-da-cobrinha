package jogo;

public class Campo {
    
    private int nivel;
    private Personagem personagem;
    private Barreira[][] parede;
    private int largura;
    private int altura;
    private Posicao posicao;

    public Campo(int nivel, Personagem personagem, Barreira[][] parede) {
        this.nivel = nivel;
        this.personagem = personagem;
        this.parede = parede;
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
    
    
    
}

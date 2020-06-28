package jogo;

public class Partida {
    private Campo campo;
    private Personagem personagem;
    private Posicao posicao;

    public Partida() {
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
}

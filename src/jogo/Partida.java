package jogo;

public class Partida {
    private Campo campo;
    private Personagem personagem;
    private Posicao posicao;
    private Integer estado;

    public Partida() {
        estado = 1;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    
}

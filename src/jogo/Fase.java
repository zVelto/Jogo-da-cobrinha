package jogo;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    
    private String nome;
    private List<Barreira> barreiras = new ArrayList<>();

    public Fase(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Barreira> getBarreiras() {
        return barreiras;
    }

    public void setBarreiras(List<Barreira> barreiras) {
        this.barreiras = barreiras;
    }
}

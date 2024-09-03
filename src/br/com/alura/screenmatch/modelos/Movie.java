package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmach.calculos.Classificavel;

public class Movie extends titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}

package br.com.alura.screenmach.calculos;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.serie;
import br.com.alura.screenmatch.modelos.titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Movie f){
////        this.tempoTotal +=f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(serie s){
//        this.tempoTotal +=s.getDuracaoEmMinutos();
//
//    }

    public void inclui (titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

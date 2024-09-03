package br.com.alura.screenmatch.modelos;

public class serie extends titulo {

    private int temporadas;
    private boolean ativa;
    private int epPorTemporda;
    private int minutoPorEpsodeo;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutoPorEpsodeo() {
        return minutoPorEpsodeo;
    }

    public void setMinutoPorEpsodeo(int minutoPorEpsodeo) {
        this.minutoPorEpsodeo = minutoPorEpsodeo;
    }

    public int getEpPorTemporda() {
        return epPorTemporda;
    }

    public void setEpPorTemporda(int epPorTemporda) {
        this.epPorTemporda = epPorTemporda;

    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas  * epPorTemporda * minutoPorEpsodeo;
    }
}

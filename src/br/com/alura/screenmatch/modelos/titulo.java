package br.com.alura.screenmatch.modelos;

public class titulo {

    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private String nome;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    private double somaDasAvalicoes;

    private int TotalDeAvaliacao;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String n) {
        this.nome = nome;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme" + nome);
        System.out.println("Ano de lançamento" + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;

    }
}






package br.com.alura.djoo.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

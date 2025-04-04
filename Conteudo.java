package Aula_12;

public abstract class Conteudo {
    private String titulo;
    private String categoria;
    private int duracao;

    public Conteudo(String titulo, String categoria, int duracao) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDuracao() {
        return duracao;
    }

    public abstract void exibirInfo();
}
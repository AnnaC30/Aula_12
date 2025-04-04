package Aula_12;

public class Filme extends Conteudo {
    private String diretor;

    public Filme(String titulo, String categoria, int duracao, String diretor) {
        super(titulo, categoria, duracao);
        this.diretor = diretor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Diretor: " + diretor);
        System.out.println("------------------------");
    }
}
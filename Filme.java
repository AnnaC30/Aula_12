package Aula_12;

public class Filme extends Conteudo {
    private String diretor;

    public Filme(String titulo, String categoria, int duracao, String diretor) {
        super(titulo, categoria, duracao);
        this.diretor = diretor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\n=== INFORMAÇÕES DO FILME ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Diretor: " + diretor);
        System.out.println("--------------------------");
    }
}
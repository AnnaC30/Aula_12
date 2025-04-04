package Aula_12;

public class Serie extends Conteudo {
    private int temporadas;

    public Serie(String titulo, String categoria, int duracao, int temporadas) {
        super(titulo, categoria, duracao);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\n=== INFORMAÇÕES DA SÉRIE ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Duração por episódio: " + getDuracao() + " minutos");
        System.out.println("Temporadas: " + temporadas);
        System.out.println("--------------------------");
    }
}
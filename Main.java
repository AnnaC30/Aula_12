package Aula_12;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Filme filme1 = new Filme("Silent Hill", "Terror", 125, "Christophe Gans");
        Filme filme2 = new Filme("Madagascar", "Animação", 86, "Eric Darnell, Tom McGrath");

        Serie serie1 = new Serie("Sandman", "Fantasia", 50, 1);
        Serie serie2 = new Serie("Supernatural", "Terror", 45, 15);

        plataforma.adicionarConteudo(filme1);
        plataforma.adicionarConteudo(filme2);
        plataforma.adicionarConteudo(serie1);
        plataforma.adicionarConteudo(serie2);

        System.out.println("\n=== TODOS OS CONTEÚDOS ADICIONADOS ===");
        plataforma.exibirTodosConteudos();

        System.out.println("\n=== BUSCA POR TÍTULO ===");
        plataforma.buscarPorTitulo("Sandman");
        plataforma.buscarPorTitulo("Madagascar");

        System.out.println("\n=== CONTEÚDOS POR CATEGORIA ===");
        plataforma.exibirConteudosPorCategoria("Terror");

        System.out.println("\n=== CONTEÚDOS POR DURAÇÃO ===");
        plataforma.exibirConteudosPorDuracao(45);

        System.out.println("\n=== REMOVENDO CONTEÚDO ===");
        plataforma.removerConteudoPorTitulo("Supernatural");

        System.out.println("\n=== CONTEÚDOS APÓS REMOÇÃO ===");
        plataforma.exibirTodosConteudos();
    }
}
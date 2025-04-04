package Aula_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        
        while (true) {
            System.out.println("\n=== 🎬 PLATAFORMA DE STREAMING ===");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Série");
            System.out.println("3. Remover Conteúdo");
            System.out.println("4. Buscar Conteúdo");
            System.out.println("5. Listar Todos");
            System.out.println("6. Filtrar por Categoria");
            System.out.println("7. Filtrar por Duração");
            System.out.println("0. Sair");
            System.out.print("👉 Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("\nTítulo do Filme: ");
                    String tituloFilme = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoriaFilme = scanner.nextLine();
                    System.out.print("Duração (minutos): ");
                    int duracaoFilme = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diretor: ");
                    String diretor = scanner.nextLine();
                    
                    Filme novoFilme = new Filme(tituloFilme, categoriaFilme, duracaoFilme, diretor);
                    plataforma.adicionarConteudo(novoFilme);
                    break;
                    
                case 2:
                    System.out.print("\nTítulo da Série: ");
                    String tituloSerie = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoriaSerie = scanner.nextLine();
                    System.out.print("Duração por episódio (minutos): ");
                    int duracaoSerie = scanner.nextInt();
                    System.out.print("Número de Temporadas: ");
                    int temporadas = scanner.nextInt();
                    scanner.nextLine();
                    
                    Serie novaSerie = new Serie(tituloSerie, categoriaSerie, duracaoSerie, temporadas);
                    plataforma.adicionarConteudo(novaSerie);
                    break;
                    
                case 3:
                    System.out.print("\nDigite o título do conteúdo a remover: ");
                    String tituloRemover = scanner.nextLine();
                    plataforma.removerConteudoPorTitulo(tituloRemover);
                    break;
                    
                case 4:
                    System.out.print("\nDigite o título para buscar: ");
                    String tituloBusca = scanner.nextLine();
                    plataforma.buscarPorTitulo(tituloBusca);
                    break;
                    
                case 5:
                    plataforma.exibirTodosConteudos();
                    break;
                    
                case 6:
                    System.out.print("\nDigite a categoria para filtrar: ");
                    String categoriaFiltrar = scanner.nextLine();
                    plataforma.exibirConteudosPorCategoria(categoriaFiltrar);
                    break;
                    
                case 7:
                    System.out.print("\nDigite a duração (minutos): ");
                    int duracaoFiltrar = scanner.nextInt();
                    scanner.nextLine();
                    plataforma.exibirConteudosPorDuracao(duracaoFiltrar);
                    break;
                    
                case 0:
                    System.out.println("\nSaindo... Até logo! 👋");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("\n❌ Opção inválida! Tente novamente.");
            }
        }
    }
}
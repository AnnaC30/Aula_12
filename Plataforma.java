package Aula_12;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Conteudo> conteudos;

    public Plataforma() {
        conteudos = new ArrayList<>();
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
        System.out.println("Conteúdo adicionado com sucesso!");
    }

    public void removerConteudo(Conteudo conteudo) {
        if (conteudos.remove(conteudo)) {
            System.out.println("Conteúdo removido com sucesso!");
        } else {
            System.out.println("Conteúdo não encontrado.");
        }
    }

    public void removerConteudoPorTitulo(String titulo) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getTitulo().equalsIgnoreCase(titulo)) {
                conteudos.remove(conteudo);
                System.out.println("Conteúdo removido com sucesso!");
                return;
            }
        }
        System.out.println("Conteúdo não encontrado.");
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void buscarPorTitulo(String titulo) {
        boolean encontrado = false;
        System.out.println("\nResultados da busca por '" + titulo + "':");
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getTitulo().equalsIgnoreCase(titulo)) {
                conteudo.exibirInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum conteúdo encontrado.");
        }
    }

    public void exibirConteudosPorCategoria(String categoria) {
        boolean encontrado = false;
        System.out.println("\nConteúdos da categoria '" + categoria + "':");
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getCategoria().equalsIgnoreCase(categoria)) {
                conteudo.exibirInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum conteúdo encontrado.");
        }
    }

    public void exibirConteudosPorDuracao(int duracao) {
        boolean encontrado = false;
        System.out.println("\nConteúdos com duração de " + duracao + " minutos:");
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getDuracao() == duracao) {
                conteudo.exibirInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum conteúdo encontrado.");
        }
    }

    public void exibirTodosConteudos() {
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo cadastrado.");
            return;
        }
        System.out.println("\n=== TODOS OS CONTEÚDOS ===");
        for (Conteudo c : conteudos) {
            c.exibirInfo();
        }
    }
}  
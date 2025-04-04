package Aula_12;

public class Serie extends Conteudo {
    private int temporadas;

    public Serie(String titulo, String categoria, int duracao, int temporadas) {
        super(titulo, categoria, duracao);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("------------------------");
    }
}
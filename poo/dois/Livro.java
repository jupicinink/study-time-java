package poo.dois;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    void exibirResumo() {
        System.out.printf("\"%s\" de %s com %d páginas%n",
        titulo, autor, paginas);
    }
}

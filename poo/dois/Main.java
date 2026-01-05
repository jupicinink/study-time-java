package poo.dois;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "1984";
        livro.autor = "George Orwell";
        livro.paginas = 328;

        livro.exibirResumo();
    }
}

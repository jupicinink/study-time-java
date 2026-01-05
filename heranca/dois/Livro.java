package heranca.dois;

public class Livro extends Midia {
    private String autor;
    
    public Livro(String titulo, int anopublicacao, String autor) {
        super(titulo, anopublicacao);
        this.autor = autor;
    }
    
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + getTitulo() + "\" - Autor: " + autor);
    }
    
}

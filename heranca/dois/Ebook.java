package heranca.dois;

public class Ebook extends Midia {
    private String formato;
 
    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }
 
    public String getFormato() {
        return formato;
    }
 
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: \"" + getTitulo() + "\" - Formato: " + formato);
    }
}

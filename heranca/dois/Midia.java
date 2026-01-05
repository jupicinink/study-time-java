package heranca.dois;

public class Midia {
    private String titulo;
    private int anopublicacao;

    public Midia (String titulo, int anopublicacao){
        this.titulo = titulo;
        this.anopublicacao = anopublicacao;
    }
    public String gerarCodigo(){
        return "LIB-" + titulo.substring(0,3) + anopublicacao;
    }

        public String getTitulo() {
        return titulo;
    }
    public int getAnoPublicacao() {
        return anopublicacao;
    }
}

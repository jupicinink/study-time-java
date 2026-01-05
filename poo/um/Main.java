package poo.um;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 3500.00;
        produto.quantidade = 5;

        System.out.println(produto.relatorio());
    }
}

package encapsulamento.tres;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco inicial: R$ " + produto.getPreco());

        produto.setPreco(3200.00);
        System.out.println("Preco atualizado: R$ " + produto.getPreco());

        produto.setPreco(-1500.00); // Tentativa de definir um preco negativo
        System.out.println("Preco apos tentativa invalida: R$ " + produto.getPreco());
    }
}

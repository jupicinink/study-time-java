package poo.nove;

public class Main {
    public static void main(String[] args) {
        Itens item1 = new Itens();
        item1.nome = "Caneta";
        item1.preco = 120.0;
        item1.quantidade = 1;

        Itens item2 = new Itens();
        item2.nome = "Caderno";
        item2.preco = 60.0;
        item2.quantidade = 2;

        double totalCompra = item1.calcularTotal() + item2.calcularTotal();
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}

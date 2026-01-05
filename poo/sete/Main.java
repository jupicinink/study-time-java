package poo.sete;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.nome = "Caneta";
        item1.quantidade = 100;

        Item item2 = new Item();
        item2.nome = "Caderno";
        item2.quantidade = 50;

        item1.exibir();
        item2.exibir();

        item1.vender(30);
        item2.vender(60);

        item1.exibir();
        item2.exibir();
    }
}

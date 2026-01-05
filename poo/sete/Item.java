package poo.sete;

public class Item {
    String nome;
    int quantidade;

    void exibir() {
        System.out.println("Item: " + nome + " - Quantidade: " + quantidade);
    }

    void vender(int vendaQuantidade) {
        if (vendaQuantidade <= quantidade) {
            quantidade -= vendaQuantidade;
            System.out.println("Vendido " + vendaQuantidade + " unidades de " + nome);
        } else {
            System.out.println("Estoque insuficiente para vender " + vendaQuantidade + " unidades de " + nome);
        }
        
    }
}

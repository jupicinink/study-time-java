package poo.nove;

public class Itens {
    
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }
}

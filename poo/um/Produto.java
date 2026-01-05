package poo.um;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public String relatorio() {
        return "Nome: " + nome + 
        ", Preço: R$  " + preco + 
        ", Quantidade em estoque: " + quantidade;
    }
}

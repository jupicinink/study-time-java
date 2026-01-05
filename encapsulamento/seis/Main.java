package encapsulamento.seis;

public class Main {
    public static void main(String[] args) {
        
        Conta conta = new Conta("Ana");
        conta.depositar(500);
        System.out.println(conta.exibirSaldo());
        conta.sacar(1200.00);
        conta.exibirSaldo();
    }
}

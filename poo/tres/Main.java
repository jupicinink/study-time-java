package poo.tres;

public class Main {
    public static void main(String[] args) {
        Saldo minhaConta = new Saldo();
        minhaConta.saldo = 1500.75;

        minhaConta.exibirSaldo();
        minhaConta.zerarSaldo();
        minhaConta.exibirSaldo();
    }
}

package poo.tres;

public class Saldo {
    double saldo;

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    void zerarSaldo() {
        saldo = 0;
        System.out.println("O saldo foi zerado.");
    }
}

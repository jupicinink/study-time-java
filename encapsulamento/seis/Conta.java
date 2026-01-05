package encapsulamento.seis;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");    
        }
    }
    public String exibirSaldo() {
        return "saldo atual de " + titular + ": R$ " + saldo;
    }

}

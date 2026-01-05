package poo.cinco;

public class Aluno {
    String nome;
    double nota1;
    double nota2;


    double calcularMedia() {
        return (nota1 + nota2 ) / 2;
    }

    Object[] situacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        return null;
    }

    void exibirInformacoes() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.printf("s: %.2f%n", situacao());

    }
}

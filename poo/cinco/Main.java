package poo.cinco;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.nota1 = 6.5;
        aluno1.nota2 = 7.0;

        System.out.println("Informações do Aluno 1:");
        aluno1.exibirInformacoes();


    }
}

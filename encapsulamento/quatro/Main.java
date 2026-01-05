package encapsulamento.quatro;

public class Main {
    public static void main(String[] args) {
        Senha minhaSenha = new Senha("123");
        System.out.println("Senha inicial: " + minhaSenha.getSenha());

        minhaSenha.setSenha("123", "456");
        System.out.println("Senha atualizada: " + minhaSenha.getSenha());

        minhaSenha.setSenha("000", "789"); // Tentativa de alterar com senha incorreta
    }
}

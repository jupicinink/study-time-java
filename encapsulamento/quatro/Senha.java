package encapsulamento.quatro;

public class Senha {
    private String senha;

    public Senha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;       
    }

    public void setSenha(String senhaantiga, String senha) {
        if (senhaantiga.equals(this.senha)) {
            this.senha = senha;
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}

package encapsulamento.dois;

public class AgendaContato {
    private Contato[] contatos;
    private int quantidadeContatos;

    public AgendaContato(int capacidade) {
        this.contatos = new Contato[capacidade];
        this.quantidadeContatos = 0;
    }

    public void adicionarContato(Contato contato) {
        if (quantidadeContatos < contatos.length) {
            contatos[quantidadeContatos] = contato;
            quantidadeContatos++;
        } else {
            System.out.println("Agenda cheia! Nao e possivel adicionar mais contatos.");
        }
    }
    public void listarContatos() {
        for (int i = 0; i < quantidadeContatos; i++) {
            System.out.println(contatos[i]);
        }
    }
}

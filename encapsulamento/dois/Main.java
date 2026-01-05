package encapsulamento.dois;

public class Main {
    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato(5);
        
        Contato contato1 = new Contato("Alice", "123456789");
        Contato contato2 = new Contato("Bob", "987654321" );
        Contato contato3 = new Contato("Charlie", "555555555");
        
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        System.out.println("Lista de contatos:");
        agenda.listarContatos();
    }
}
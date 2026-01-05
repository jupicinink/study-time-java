package poo.seis;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        tarefa1.descricao = "Estudar Java";
        tarefa1.concluida = false;

        Tarefa tarefa2 = new Tarefa();
        tarefa2.descricao = "Fazer exercícios de POO";
        tarefa2.concluida = true;

        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.add(tarefa1);
        listaDeTarefas.add(tarefa2);

        

        for (Tarefa tarefa : listaDeTarefas) {
            tarefa.exibir();
        }
    }
}

package colections.add;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("a");
        funcionarios.add("s");
        funcionarios.add("d");
        funcionarios.add("f");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));

        System.out.println("Total de funcionários: " + funcionarios.size());
    }
}

package loops;

import java.util.Scanner;

public class ContagemDegrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int quantidadeDegraus = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= quantidadeDegraus; i++) {
            System.out.println("Subindo o degrau  " + i);
        }
        System.out.println("Você chegou ao topo!");
    }
}


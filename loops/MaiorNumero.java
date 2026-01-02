package loops;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os numeros separados por espaco: ");
        int maiorNumero = scanner.nextInt();
        scanner.close();
    }
}

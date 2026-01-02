package loops;

import java.util.Scanner;

public class ignorando5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        int numero = scanner.nextInt();

        for(int i =0; i < numero ; i++){
         if (i % 10 == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        scanner.close();

    }
}

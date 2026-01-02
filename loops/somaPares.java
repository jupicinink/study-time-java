package loops;

public class somaPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares é: " + soma);
    }
}
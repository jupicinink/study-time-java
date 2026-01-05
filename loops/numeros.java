package loops;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos =0;
        int negativos =0;
        while(true){
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String numerosdigitados = scanner.nextLine();
            if(numerosdigitados.equalsIgnoreCase("fim")){
                
                break;
            } 
            int numero = Integer.parseInt(numerosdigitados);

            if(numero % 2 ==0){
                positivos++;
            } else {
                negativos++;
            }

            System.out.println(positivos + " números pares e " + negativos + " números ímpares.");
        }
        scanner.close();
    }
}

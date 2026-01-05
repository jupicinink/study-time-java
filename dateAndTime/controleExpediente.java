package dateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class controleExpediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);
        System.out.print("Digite a carga horária diária (em horas)  ");
        int carga = scanner.nextInt();
        System.out.print("Digite o horário de saida (HH:mm): ");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);
        
        
        LocalTime saidaPrevista = entrada.plusHours(carga);
        Duration saldo = Duration.between(saidaPrevista, saida);
        long horas = saldo.toHours();
        long minutos = saldo.toMinutes();

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saida.format(formatter));

        if (saldo.isNegative()) {
            System.out.println("Você está devendo " + Math.abs(horas) + " horas e " + Math.abs(minutos) + " minutos hoje.");
        } else {
            System.out.println("Você tem um saldo positivo de " + horas + " horas e " + minutos + " minutos hoje.");
        }
        scanner.close();
    }
}

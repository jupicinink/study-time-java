package dateAndTime;

import java.time.LocalDate;

public class Evento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2026, 1, 3);
        LocalDate hoje = LocalDate.now();


        if(hoje.isAfter(dataEvento)) {
            System.out.println("Data do evento: " + dataEvento);
            System.out.println("data atual: " + hoje);
            System.out.println("O evento já ocorreu.");
        } else if(hoje.isEqual(dataEvento)) {
            System.out.println("Data do evento: " + dataEvento);
            System.out.println("data atual: " + hoje);
            System.out.println("O evento é hoje!");
        } else {
            System.out.println("Data do evento: " + dataEvento);
            System.out.println("data atual: " + hoje);
            System.out.println("O evento ainda vai acontecer.");
        }
    }
}

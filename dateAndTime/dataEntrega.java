package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dataEntrega {
    public static void main(String[] args) {
        LocalDate datainicio = LocalDate.of(2025,3,15);
        int prazoDias = 15;
        LocalDate dataEntrega = datainicio.plusDays(prazoDias);
        DateTimeFormatter dataformatada =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(dataformatada);
        System.out.println("Data de entrega: " + dataFormatada);
    }
}

package dateAndTime;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dataehoraatual {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        DateTimeFormatter dataformatada =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalTime hora = LocalTime.now();
        DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = agora.format(dataformatada);
        String horaFormatada = hora.format(horaformatada);
        
        System.out.println("Hora atual: " + horaFormatada);
        System.out.println("Data atual: " + dataFormatada);
    }
}

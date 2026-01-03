package dateAndTime;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHoras {
    public static void main(String[] args) {
        
        LocalTime horaInicio = LocalTime.of(14,30,00);
        LocalTime horaFim = LocalTime.of(16,45,00);
    
        Duration diferenca = Duration.between(horaInicio, horaFim);
        System.out.println("Diferença de tempo: " + diferenca.toHours() + "horas e " + diferenca.toMinutes() + " minutos.");
    }
}



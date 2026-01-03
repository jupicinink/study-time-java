package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dataVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025,3,20);
        int qtdMeses = 1;
        LocalDate dataVencimentoAtualizada = dataVencimentoOriginal.plusMonths(qtdMeses);

        DateTimeFormatter dataformatada =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataVencimentoAtualizada.format(dataformatada);
        System.out.println("Data de vencimento original: " + dataFormatada);
    }
}

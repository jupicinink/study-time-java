package heranca.seis;

public class ReservaVIP extends Reserva{
    @Override
    public void reservar(){
         System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}

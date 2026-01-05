package poo.quatro;

public class Main {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        sensor1.local = "Sala de Servidores";
        sensor1.temperaturaAtual = 38.2;
        
        Sensor sensor2 = new Sensor();
        sensor2.local = "Escritório";
        sensor2.temperaturaAtual = 36.8;
        
        sensor1.exibirInformações();
        sensor1.alertas();
        
        sensor2.exibirInformações();
        sensor2.alertas();
    }
}

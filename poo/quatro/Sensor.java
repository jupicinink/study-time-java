package poo.quatro;

public class Sensor {
    String local;
    double temperaturaAtual;
    double temperaturaMaxima = 37.5;

    void alertas(){
        if(temperaturaAtual > temperaturaMaxima){
            System.out.printf("Alerta! A temperatura em %s (%.2f°C) excedeu o limite máximo de %.2f°C.%n", local, temperaturaAtual, temperaturaMaxima);
        } else {
            System.out.printf("A temperatura em %s (%.2f°C) está dentro do limite seguro de %.2f°C.%n", local, temperaturaAtual, temperaturaMaxima);
        } 
    }
    
    
    void exibirInformações() {
        System.out.printf("Temperatura atual em %s: %.2f°C%n", local, temperaturaAtual);
    }

}

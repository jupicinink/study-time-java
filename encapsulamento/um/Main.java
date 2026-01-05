package encapsulamento.um;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Toyota Corolla");
        carro.setAno(2020);
        carro.setPlaca("ABC-1234");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Placa: " + carro.getPlaca());
    }
}

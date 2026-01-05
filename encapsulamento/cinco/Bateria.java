package encapsulamento.cinco;

public class Bateria {
    private int carga;
    public void setCarga(int carga) {
        if (carga >= 0 && carga <= 100) {
            this.carga = carga;
        } else {
            System.out.println("Carga inválida. Deve estar entre 0 e 100.");
        }
    }
    public int getCarga() {
        return carga;
    }

    public String exibirStatus() {
        if (carga <= 20) {
            return "Bateria fraca";
        } else if (carga <= 80) {
            return "Bateria ok";
        } else {
            return "Bateria cheia";
        }
    }

}

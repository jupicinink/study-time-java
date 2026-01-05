package heranca.um;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("fernanda","regular");
        Bolsista aluno2 = new Bolsista("lucas");

        aluno1.identificar();
        aluno2.identificar();

    }
}

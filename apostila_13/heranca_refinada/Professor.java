package heranca_refinada;

public class Professor extends Pessoa {
    int matricula;

    public void lecionar() {
        System.out.println(getNome() + " lecionando...");
    }

}

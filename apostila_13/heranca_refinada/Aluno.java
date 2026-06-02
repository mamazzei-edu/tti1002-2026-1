package heranca_refinada;

public class Aluno extends Pessoa {
    int ra;

    public Aluno(String nome, int idade) {
        super(nome, idade);
        System.out.println("Construindo Aluno...");
    }

}

package sem_heranca;
public class ProfessorPesquisador {
    private String nome;
    private int idade;
    // getters/setters

    public void pesquisar() {
        System.out.println("Pesquisando..");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

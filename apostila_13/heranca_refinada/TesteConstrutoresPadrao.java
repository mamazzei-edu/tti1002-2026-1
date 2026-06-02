import heranca_refinada.Professor;
import heranca_refinada.ProfessorHorista;
import heranca_refinada.Pessoa;
import heranca_refinada.Aluno;

public class TesteConstrutoresPadrao {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 20);
        Aluno a = new Aluno();
        Professor p2 = new Professor();
        // ProfessorHorista horista = new ProfessorHorista();
    }
}

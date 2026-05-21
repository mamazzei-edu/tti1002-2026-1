package heranca_refinada;

public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("Rodrigo");
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.setNome("José");
        profHorista.lecionar();
        profPesq.lecionar();
    }
}

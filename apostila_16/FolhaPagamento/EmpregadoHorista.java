package FolhaPagamento;

public class EmpregadoHorista extends Empregado {
    private double valorHora;
    private int numeroHoras;

    public EmpregadoHorista(double valorHora, int numeroHoras) {
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calculaSalario() {
        return this.valorHora * this.numeroHoras;
    }
}

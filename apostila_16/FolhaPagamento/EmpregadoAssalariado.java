package FolhaPagamento;

public class EmpregadoAssalariado extends Empregado {
    private double salario;

    public EmpregadoAssalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaSalario() {
        return this.salario;
    }

}

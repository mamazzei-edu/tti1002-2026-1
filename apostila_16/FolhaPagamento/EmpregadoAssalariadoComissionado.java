package FolhaPagamento;

public class EmpregadoAssalariadoComissionado extends Empregado {

    public EmpregadoAssalariadoComissionado(double salario, double comissao) {
        this.setSalario(salario);
        this.setComissao(comissao);
    }

    public double calculaSalario() {
        return this.getSalario() + this.getComissao();
    }

}

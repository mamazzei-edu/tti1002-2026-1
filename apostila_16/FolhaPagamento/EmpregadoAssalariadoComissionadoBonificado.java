package FolhaPagamento;

public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {

    public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus) {
        this.setSalario(salario);
        this.setComissao(comissao);
        this.setBonus(bonus);
    }

    public double calculaSalario() {
        return this.getSalario() + this.getBonus() + this.getComissao();
    }

}

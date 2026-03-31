package ContaBancariaEx;

public class ContaBancaria {
    private String nomeDoTitular;
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String nomeDoTitular, String numeroDaConta, double saldoInicial) {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

    public void depositar (double valor) {
        if (valor>0) {
            System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valor);
            saldo += valor;
        }
    }

    public void sacar (double valor) {
        if (verificaValor(valor)) {
            saldo -= valor;
                System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (verificaValor(valor)) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$%.2f realizada com sucesso para a conta %s.%n", valor, contaDestino.numeroDaConta);
        }
    }   

    private boolean verificaValor(double valor) {
        if (valor > 0 && valor <= saldo) {
            return true;
        } else {
            if (valor < 0) {
                System.out.println("Valor deve ser positivo.");
            } else {
                System.out.println("Saldo insuficiente para realizar a operação.");
            }
            return false;
        }
    }

    public void consultarSaldo() {
        System.out.println("Conta número: " + numeroDaConta);
        System.out.println("Titular: " + nomeDoTitular);
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public void exibirExtrato() {
        System.out.println("==================================");
        consultarSaldo();
        System.out.println("==================================");
    }

}

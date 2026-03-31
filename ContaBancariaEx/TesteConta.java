package ContaBancariaEx;
public class TesteConta {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria conta1 = new ContaBancaria("João Silva", "12345-6", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Maria Oliveira", "65432-1", 500.00);

        while (true) {
            // Simulate some operations
            ContaBancaria contaOrigem = Math.random() < 0.5 ? conta1 : conta2;
            ContaBancaria contaDestino = contaOrigem == conta1 ? conta2 : conta1;
            int operacao = (int) (Math.random() * 3); // 0: depositar, 1: sacar, 2: transferir
            double valor = Math.random() * 499.99 + 0.01; // Random value between 0 and 500
            switch (operacao) {
                case 0:
                    contaOrigem.depositar(valor);
                    break;
                case 1:
                    contaOrigem.sacar(valor);
                    break;
                case 2:
                    contaOrigem.transferir(valor, contaDestino);
                    break;
            }
            conta1.exibirExtrato();
            conta2.exibirExtrato();
            Thread.sleep(2000); // Pause for 2 seconds before the next operation
        }
    }

}

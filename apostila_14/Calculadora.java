public class Calculadora {
    public int soma(int a, int b) {
        // usando uma variável para o resultado
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public int subtracao(int a, int b) {
        // sem usar uma variável para o resultado
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        // note que aqui ocorre a divisão inteira
        return a / b;
    }
}
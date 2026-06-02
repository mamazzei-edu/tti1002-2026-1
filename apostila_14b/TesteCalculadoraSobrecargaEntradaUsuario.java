import javax.swing.JOptionPane;

public class TesteCalculadoraSobrecargaEntradaUsuario {

    public static void main(String[] args) {
        // construindo uma calculadora
        Calculadora c = new Calculadora();
        // o que o usuário quer?
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao"));
        // quais os operandos?
        Object operando1 = JOptionPane.showInputDialog("Qual o primeiro operando?");
        Object operando2 = JOptionPane.showInputDialog("Qual o segundo operando?");
    }

}

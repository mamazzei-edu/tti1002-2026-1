import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorDeTemperatura {

    public static void criarTela() {
        JFrame tela = new JFrame("Conversor de Temperatura");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton converterButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 4, 2, 4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(valorConvertidoLabel);

        converterButton.addActionListener(e -> {
                try {
                double celsius = Double.parseDouble(celsiusTextField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                valorConvertidoLabel.setText(String.format("%.2f \u00B0F", fahrenheit));
            } catch (NumberFormatException ex) {
                valorConvertidoLabel.setText("Entrada inválida");
            }
        });

        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}

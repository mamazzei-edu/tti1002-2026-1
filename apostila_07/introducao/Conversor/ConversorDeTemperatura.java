import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorDeTemperatura {

    public static void criarTela() {
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel ("\u00b0C");
        JButton converterButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("Valor convertido: ");
        Container painelDeConteudo = tela.getContentPane();
        tela.setLayout(new GridLayout(2,4,2,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(valorConvertidoLabel);
    }

}
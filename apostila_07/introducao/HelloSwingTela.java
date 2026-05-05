package introducao;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwingTela {
    public static void criarTela() {
        JFrame tela = new JFrame("Hello Swing");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel helloSwingLabel = new JLabel("Hello Swing!");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(helloSwingLabel);
        tela.pack();
        tela.setVisible(true);
    }

    public static void main2(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}

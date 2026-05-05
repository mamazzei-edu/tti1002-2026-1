
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {
    public static void criarTela() {
        JFrame tela = new JFrame("Hello, Swing!!!");
        JLabel helloSwingLabel = new JLabel ("Hello, Swing!!!!!!!");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(helloSwingLabel);
        tela.pack();
        tela.setVisible(true);
    }    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            criarTela()
        );
    }
}

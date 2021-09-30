package input;

import javax.swing.JOptionPane;

public class Input {
    public static String lerOpcoesSelect(String mensagem, String titulo, String[] opcoes) {
        return String.valueOf(JOptionPane.showInputDialog(null, mensagem, titulo,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]));
    }

    public static int lerConfirmacao(String mensagem) {
        return JOptionPane.showConfirmDialog(null, mensagem);
    }
}

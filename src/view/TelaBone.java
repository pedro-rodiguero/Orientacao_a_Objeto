package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe para gerar o GUI da tela bone.
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaBone {
	
	private static JFrame janela = new JFrame("Tela bone");
	private static JLabel titulo = new JLabel("Bones disponiveis:");
	
	/**
	 * Instancia uma nova tela bone.
	 */
	public TelaBone() {
		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(120, 5, 300, 30);

		janela.add(titulo);

		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}

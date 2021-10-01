package interfaceGrafica;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaProduto {
	
	private static JFrame janela = new JFrame("Tela produto");
	private static JLabel titulo = new JLabel("Produtos cadastrados:");
	
	
	public TelaProduto() {
		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(120, 5, 300, 30);
		
		
		janela.setLayout(null);
		janela.add(titulo);
		
	
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}

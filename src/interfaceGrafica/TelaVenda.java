package interfaceGrafica;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVenda {
	
	private static JFrame janela = new JFrame("Tela venda");
	private static JLabel titulo = new JLabel("Vendas cadastradas:");
	private static JButton compra = new JButton("Realizar uma compra");
	
	public TelaVenda() {
		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(120, 5, 300, 30);
		compra.setFont(new Font("Cambria", Font.BOLD, 15));
		compra.setBounds(100, 170, 200, 30);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(compra);
	
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
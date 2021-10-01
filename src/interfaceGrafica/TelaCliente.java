package interfaceGrafica;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCliente {
	
	private static JFrame janela = new JFrame("Tela cliente");
	private static JLabel titulo = new JLabel("Dados dos clientes já cadastrados:");
	private static JButton cadastro = new JButton("Novo cadastro");
	
	public TelaCliente() {
		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(70, 5, 300, 30);
		cadastro.setFont(new Font("Cambria", Font.BOLD, 15));
		cadastro.setBounds(100, 170, 200, 30);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(cadastro);
	
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}

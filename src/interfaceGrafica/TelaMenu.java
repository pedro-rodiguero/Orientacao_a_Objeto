package interfaceGrafica;

import dados.Loja;
import input.Input;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class TelaMenu implements ActionListener{
	
	private static JFrame janela = new JFrame("Tela inicial");
	private static JLabel titulo = new JLabel("Menu principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton venda = new JButton("Venda");
	private static JButton loja = new JButton("Loja");
	private static JButton produto = new JButton("Produto");

	public TelaMenu() {
		titulo.setFont(new Font("Broadway", Font.BOLD, 20));
		titulo.setBounds(100, 20, 300, 30);

		cliente.setFont(new Font("Cambria", Font.BOLD, 13));
		cliente.setBounds(70, 70, 100, 30);

		venda.setFont(new Font("Cambria", Font.BOLD, 13));
		venda.setBounds(70, 130, 100, 30);

		produto.setFont(new Font("Cambria", Font.BOLD, 13));
		produto.setBounds(200, 70, 100, 30);

		loja.setFont(new Font("Cambria", Font.BOLD, 13));
		loja.setBounds(200, 130, 100, 30);

		janela.add(titulo);
		janela.add(cliente);
		janela.add(venda);
		janela.add(loja);
		janela.add(produto);

		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		cliente.addActionListener(menu);
		venda.addActionListener(menu);
		loja.addActionListener(menu);
		produto.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cliente)
			new TelaCliente();
		if(src == venda)
			new TelaVenda();
		if(src == loja)
			new TelaLoja();
		if(src == produto)
			new TelaProduto();
	}

}

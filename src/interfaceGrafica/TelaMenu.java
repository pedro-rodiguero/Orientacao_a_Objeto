package interfaceGrafica;

<<<<<<< HEAD

import input.Input;
=======
import dados.Loja;
>>>>>>> fa47ad818d7469992e86880cd0039ad7099b0e11

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
	private static JButton produto = new JButton("Produto");

	public TelaMenu() {
		titulo.setFont(new Font("Broadway", Font.BOLD, 20));
		titulo.setBounds(100, 20, 300, 30);

		cliente.setFont(new Font("Cambria", Font.BOLD, 13));
<<<<<<< HEAD
		cliente.setBounds(140, 60, 100, 30);
		venda.setFont(new Font("Cambria", Font.BOLD, 13));
		venda.setBounds(140, 110, 100, 30);
		produto.setFont(new Font("Cambria", Font.BOLD, 13));
		produto.setBounds(140, 160, 100, 30);
		
=======
		cliente.setBounds(70, 70, 100, 30);

		venda.setFont(new Font("Cambria", Font.BOLD, 13));
		venda.setBounds(70, 130, 100, 30);

		produto.setFont(new Font("Cambria", Font.BOLD, 13));
		produto.setBounds(200, 70, 100, 30);

		loja.setFont(new Font("Cambria", Font.BOLD, 13));
		loja.setBounds(200, 130, 100, 30);
>>>>>>> fa47ad818d7469992e86880cd0039ad7099b0e11

		janela.add(titulo);
		janela.add(cliente);
		janela.add(venda);
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
		produto.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cliente)
			new TelaCliente();
		if(src == venda)
			new TelaVenda();
<<<<<<< HEAD
		
=======
		if(src == loja)
			new TelaLoja();
>>>>>>> fa47ad818d7469992e86880cd0039ad7099b0e11
		if(src == produto)
			new TelaProduto();
	}

}

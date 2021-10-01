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

public class CadastroLoja implements ActionListener{
	
	private static JFrame janela = new JFrame("Tela inicial");
	private static JLabel titulo = new JLabel("Menu principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton venda = new JButton("Venda");
	
	
	
	public CadastroLoja() {
		titulo.setFont(new Font("Broadway", Font.BOLD, 20));
		titulo.setBounds(100, 20, 300, 30);
		cliente.setFont(new Font("Cambria", Font.BOLD, 13));
		cliente.setBounds(140, 70, 100, 30);
		venda.setFont(new Font("Cambria", Font.BOLD, 13));
		venda.setBounds(140, 130, 100, 30);

		janela.setLayout(null);
		janela.add(titulo);
		janela.add(cliente);
		janela.add(venda);
	
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		CadastroLoja menu = new CadastroLoja();
		
		cliente.addActionListener(menu);
		venda.addActionListener(menu);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cliente)
			new TelaCliente();
		
		if(src == venda)
			new TelaVenda();
	}

}

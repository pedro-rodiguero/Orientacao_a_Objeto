package interfaceGrafica;

import dados.PreCadastros;
import dados.Produto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import static output.Output.listarClientes;

public class TelaCliente extends JFrame{
	
	private static JFrame janela = new JFrame("Tela cliente");
	private static JLabel titulo = new JLabel("Dados dos clientes ja cadastrados:");
	JButton cadastro = new JButton("Novo cadastro");
	JButton listarClientes = new JButton("Listar clientes");
	private static JDesktopPane desktopPane = new JDesktopPane();
	
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
		setResizable(false);

		cadastro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				listarClientes();
			}
		});
		cadastro.setBounds(735, 361, 89, 23);
		desktopPane.add(cadastro);

		listarClientes.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}

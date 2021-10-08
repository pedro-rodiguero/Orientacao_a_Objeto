package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.TelaClienteController;

/**
 * Classe para gerar o GUI da tela cliente.
 * 
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaCliente extends JFrame implements ActionListener {
//		DEFAULT LIST MODEL!!!!
	private final JLabel titulo;
	private final JLabel cpfLabel;
	private final JLabel nomeLabel;

	private final JTextField valorNome;
	private final JTextField valorCpf;
	private final JButton cadastro;
	private final Font fontePadrao;

	private final TelaClienteController controller;

	/**
	 * Instancia uma nova tela cliente.
	 */
	public TelaCliente() {
		super("Tela Cliente");
		this.controller = new TelaClienteController(this);

		this.fontePadrao = new Font("Cambria", Font.BOLD, 15);

		getContentPane().setLayout(null);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.titulo = new JLabel("Cliente");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(161, 12, 63, 30);
		getContentPane().add(titulo);

		this.cpfLabel = new JLabel("CPF");
		this.cpfLabel.setFont(fontePadrao);
		this.cpfLabel.setBounds(22, 31, 63, 30);
		getContentPane().add(cpfLabel);

		this.nomeLabel = new JLabel("Nome");
		this.nomeLabel.setFont(fontePadrao);
		this.nomeLabel.setBounds(315, 31, 63, 30);
		getContentPane().add(nomeLabel);

		this.valorNome = new JTextField(20);
		this.valorNome.setBounds(252, 73, 126, 30);
		getContentPane().add(valorNome);

		this.valorCpf = new JTextField(20);
		this.valorCpf.setBounds(22, 73, 126, 30);
		getContentPane().add(valorCpf);

		this.cadastro = new JButton("Cadastro");
		this.cadastro.setFont(fontePadrao);
		this.cadastro.setBounds(46, 164, 300, 30);
		this.cadastro.addActionListener(this);
		getContentPane().add(cadastro);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.controller.executarBotao(arg0);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JTextField getValorNome() {
		return valorNome;
	}

	public JTextField getValorCpf() {
		return valorCpf;
	}

	public JButton getCadastro() {
		return cadastro;
	}

	public Font getFontePadrao() {
		return fontePadrao;
	}

	public TelaClienteController getController() {
		return controller;
	}

}

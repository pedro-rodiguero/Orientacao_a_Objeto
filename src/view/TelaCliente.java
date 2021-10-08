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
	private final JLabel cepLabel;
	private final JLabel telefoneLabel;

	private final JTextField valorNome;
	private final JTextField valorCpf;
	private final JTextField valorCep;
	private final JTextField valorTelefone;
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

		this.setLayout(null);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.titulo = new JLabel("Cliente");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(160, 0, 63, 30);
		this.add(titulo);

		this.cpfLabel = new JLabel("CPF");
		this.cpfLabel.setFont(fontePadrao);
		this.cpfLabel.setBounds(20, 73, 63, 30);
		this.add(cpfLabel);

		this.nomeLabel = new JLabel("Nome");
		this.nomeLabel.setFont(fontePadrao);
		this.nomeLabel.setBounds(20, 30, 63, 30);
		this.add(nomeLabel);
		
		this.cepLabel = new JLabel("CEP");
		this.cepLabel.setFont(fontePadrao);
		this.cepLabel.setBounds(20, 114, 63, 30);
		this.add(cepLabel);
		
		this.telefoneLabel = new JLabel("Telefone");
		this.telefoneLabel.setFont(fontePadrao);
		this.telefoneLabel.setBounds(10, 155, 63, 30);
		getContentPane().add(telefoneLabel);

		this.valorNome = new JTextField(20);
		this.valorNome.setBounds(77, 32, 126, 30);
		this.add(valorNome);

		this.valorCpf = new JTextField(20);
		this.valorCpf.setBounds(77, 76, 126, 28);
		this.add(valorCpf);
		
		this.valorCep = new JTextField(20);
		this.valorCep.setBounds(77, 114, 126, 30);
		this.add(valorCep);
		
		this.valorTelefone = new JTextField(20);
		this.valorTelefone.setBounds(77, 157, 126, 30);
		this.add(valorTelefone);

		this.cadastro = new JButton("Cadastro");
		this.cadastro.setFont(fontePadrao);
		this.cadastro.setBounds(240, 182, 126, 30);
		this.cadastro.addActionListener(this);
		this.add(cadastro);
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

	public JLabel getCepLabel() {
		return cepLabel;
	}

	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}

	public JTextField getValorCep() {
		return valorCep;
	}

	public JTextField getValorTelefone() {
		return valorTelefone;
	}

}

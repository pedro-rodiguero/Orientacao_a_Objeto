package view;
//TODO Classe esta funcionando, so precisa fazer a venda funcionar
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.TelaOculosController;

/**
 * Classe para gerar o GUI da tela oculos
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaOculos extends JFrame implements ActionListener {
	private final JLabel titulo;
	private final JButton oculosButton;
	private final Font fontePadrao;

	private final JTextField valorTamanho;

	private final TelaOculosController controller;

	/**
	 * Instancia uma nova Tela oculos.
	 */
	public TelaOculos() {
		super("Tela Oculos");
		this.controller = new TelaOculosController(this);

		this.fontePadrao = new Font("Cambria", Font.BOLD, 15);

		this.setLayout(null);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.titulo = new JLabel("Oculos");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(161, 12, 63, 30);
		this.add(titulo);

		this.oculosButton = new JButton("Ver oculos");
		this.oculosButton.setFont(fontePadrao);
		this.oculosButton.setBounds(46, 164, 300, 30);
		this.oculosButton.addActionListener(this);
		this.add(oculosButton);

		this.valorTamanho = new JTextField(20);
		this.valorTamanho.setBounds(252, 73, 126, 30);
		this.add(valorTamanho);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.executarBotao(e);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public JButton getOculosButton() {
		return oculosButton;
	}

	public Font getFontePadrao() {
		return fontePadrao;
	}

	public TelaOculosController getController() {
		return controller;
	}

	public JTextField getTamanho() {
		return valorTamanho;
	}
}

package view;

import controller.TelaBoneController;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Classe para gerar o GUI da tela bone.
 *
 * @author Pedro /Lucas
 * @version TP.05
 */
public class TelaBone extends JFrame implements ActionListener {
	private final JLabel titulo;
	private final JButton boneButton;

	private final Font fontePadrao;
	private final JTextField valorTamanho;

	private final TelaBoneController controller;

	/**
	 * Instancia uma nova tela bone.
	 */
	public TelaBone() {
		super("Tela Bone");
		this.controller = new TelaBoneController(this);

		this.fontePadrao = new Font("Cambria", Font.BOLD, 15);


		this.setLayout(null);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.valorTamanho = new JTextField(20);
		this.valorTamanho.setBounds(77, 32, 126, 30);
		this.add(valorTamanho);

		this.boneButton = new JButton("Ver bone");
		this.boneButton.setFont(fontePadrao);
		this.boneButton.setBounds(46, 164, 300, 30);
		this.boneButton.addActionListener(this);
		this.add(boneButton);

		this.titulo = new JLabel("Bone");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(160, 0, 63, 30);
		this.add(titulo);
	}

	/**
	 * Gets titulo.
	 *
	 * @return the titulo
	 */
	public JLabel getTitulo() {
		return titulo;
	}

	/**
	 * Gets fonte padrao.
	 *
	 * @return the fonte padrao
	 */
	public Font getFontePadrao() {
		return fontePadrao;
	}

	/**
	 * Gets controller.
	 *
	 * @return the controller
	 */
	public TelaBoneController getController() {
		return controller;
	}

	/**
	 * Gets valor tamanho.
	 *
	 * @return the valor tamanho
	 */
	public JTextField getValorTamanho() {
		return valorTamanho;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.executarBotao(e);
	}
}

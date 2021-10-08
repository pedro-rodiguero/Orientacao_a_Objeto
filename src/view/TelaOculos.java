package view;

import controller.TelaOculosController;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe para gerar o GUI da tela oculos
 * @author Pedro/Lucas
 * @version TP.05
 */

public class TelaOculos extends JFrame implements ActionListener {
	private final JLabel titulo;

	private final Font fontePadrao;

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

		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(120, 5, 300, 30);
	}
}

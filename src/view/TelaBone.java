package view;

import controller.TelaBoneController;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe para gerar o GUI da tela bone.
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaBone extends JFrame implements ActionListener {
	private final JLabel titulo;

	private final Font fontePadrao;

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

		this.titulo = new JLabel("Cliente");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(160, 0, 63, 30);
		this.add(titulo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}

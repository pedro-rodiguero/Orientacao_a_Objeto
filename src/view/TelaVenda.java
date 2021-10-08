package view;

import controller.TelaVendaController;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe para gerar o GUI da tela venda
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaVenda extends JFrame implements ActionListener {
	
	private final JLabel titulo;
	private final JButton compra;
	private final Font fontePadrao;
	private final TelaVendaController controller;

	/**
	 * Instancia uma nova Tela venda.
	 */
	public TelaVenda() {
		super("Tela Venda");
		this.controller = new TelaVendaController(this);

		this.fontePadrao = new Font("Cambria", Font.BOLD, 15);

		this.setLayout(null);
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.titulo = new JLabel("Vendas");
		this.titulo.setFont(fontePadrao);
		this.titulo.setBounds(160, 0, 63, 30);
		this.add(titulo);

		this.compra = new JButton("Comprar");
		this.compra.setFont(fontePadrao);
		this.compra.setBounds(240, 182, 126, 30);
		this.compra.addActionListener(this);
		this.add(compra);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.executarBotao(e);
	}
}

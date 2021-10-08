package view;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import static model.PreCadastro.preCadastro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 * Classe para gerar o GUI da tela menu.
 * @author Pedro/Lucas
 * @version TP.05
 */
public class TelaMenu implements ActionListener{
	
	private static JFrame janela = new JFrame("Tela inicial");
	private static JButton cliente = new JButton("Cliente");
	private static JButton venda = new JButton("Venda");
	private static JButton oculos = new JButton("Oculos");
	private static JButton bone = new JButton("Bone");
	ImageIcon imagem = new ImageIcon(getClass().getResource("imgMenu.jpg"));
	JLabel titulo = new JLabel("MENU DA LOJA");
	JLabel img = new JLabel(imagem);
	
	

	/**
	 * Instancia uma nova tela menu.
	 */
	public TelaMenu() {
		
		cliente.setFont(new Font("Cambria", Font.BOLD, 13));
		cliente.setBounds(70, 80, 100, 30);

		venda.setFont(new Font("Cambria", Font.BOLD, 13));
		venda.setBounds(200, 80, 100, 30);

		bone.setFont(new Font("Cambria", Font.BOLD, 13));
		bone.setBounds(70, 140, 100, 30);
		
		oculos.setFont(new Font("Cambria", Font.BOLD, 13));
		oculos.setBounds(200, 140, 100, 30);
		
		titulo.setFont(new Font("Broadway", Font.BOLD, 35));
		titulo.setBounds(45, 0, 300, 90);
		
		img.setBounds(0, 0, 400, 250);
		
		janela.add(cliente);
		janela.add(venda);
		janela.add(bone);
		janela.add(oculos);
		janela.add(titulo);
		janela.add(img);
		
		

		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	/**
	 * Adicao dos atributos.
	 * @param args argumentos do input
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		cliente.addActionListener(menu);
		venda.addActionListener(menu);
		bone.addActionListener(menu);
		oculos.addActionListener(menu);
		preCadastro();
	}
	
	/**
	 * Metodo do direcionamento para uma nova tela.
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cliente)
			new TelaCliente().setVisible(true);
		if(src == venda)
			new TelaVenda().setVisible(true);
		if(src == bone)
			new TelaBone();
		if(src == oculos)
			new TelaOculos().setVisible(true);
	}
}

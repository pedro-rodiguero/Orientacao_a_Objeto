package interfaceGrafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TelaProduto implements ActionListener{
	
	private static JFrame janela = new JFrame("Tela produto");
	private static JLabel titulo = new JLabel("Qual produto deseja selecionar?");
	private static JButton bone = new JButton("Bone");
	private static JButton oculos = new JButton("Oculos");
	
	
	
	public TelaProduto() {
		titulo.setFont(new Font("Cambria", Font.BOLD, 15));
		titulo.setBounds(80, 10, 300, 30);
		bone.setFont(new Font("Cambria", Font.BOLD, 13));
		bone.setBounds(140, 70, 100, 30);
		oculos.setFont(new Font("Cambria", Font.BOLD, 13));
		oculos.setBounds(140, 130, 100, 30);
		
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(bone);
		janela.add(oculos);
	
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaProduto produto = new TelaProduto();
		
		oculos.addActionListener(produto);
		bone.addActionListener(produto);
		
		
	}
	
	public void actionPerformed(ActionEvent p) {
		Object prod = p.getSource();
		
		if(prod == bone)
			new TelaBone();
		
		if(prod == oculos)
			new TelaOculos();
		
		
	}

}


package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Cliente;
import model.DB;
import view.TelaCliente;

public class TelaClienteController {
	private final TelaCliente view;

	public TelaClienteController(TelaCliente view) {
		this.view = view;
	}

	public void executarBotao(ActionEvent botao) {
		JButton botaoApertado = (JButton) botao.getSource();

		if (botaoApertado == this.view.getCadastro()) {
			String valorNome = view.getValorNome().getText();
			String valorCpf = view.getValorCpf().getText();
			String valorCep = view.getValorCep().getText();
			String valorTelefone = view.getValorTelefone().getText();
			Cliente cliente = new Cliente();

			cliente.setNomeCliente(valorNome);
			cliente.setCpf(valorCpf);
			cliente.setNomeCliente(valorCep);
			cliente.setCpf(valorTelefone);
			
			cliente.setCep("15456");
			cliente.setTelefone("15545454");

			DB.getListaclientes().add(cliente);
		}

		System.out.println(DB.getListaclientes());
	}
}

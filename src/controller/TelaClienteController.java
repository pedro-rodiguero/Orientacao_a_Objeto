package controller;

import java.awt.event.ActionEvent;

import javax.swing.*;

import model.Cliente;
import model.DB;
import view.TelaCliente;

public class TelaClienteController {
	private final TelaCliente view;

	public TelaClienteController(TelaCliente view) {
		this.view = view;
	}

	private static DB dados;

	private JList<String> listaClientesCadastrados;

	private String[] listaClientes = new String[20];

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

			DB.getListaclientes().add(cliente);

		} else if(botaoApertado == this.view.getListarClientes()){
			System.out.println(DB.getListaclientes());
			listaClientesCadastrados = new JList<String>(listaClientes);
		}
	}
}

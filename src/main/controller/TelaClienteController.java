package main.controller;

import java.awt.event.ActionEvent;

import javax.swing.*;

import main.model.Cliente;
import main.model.DB;
import main.view.TelaCliente;

/**
 * The type Tela cliente main.controller.
 */
public class TelaClienteController {
	private final TelaCliente view;

	/**
	 * Instantiates a new Tela cliente main.controller.
	 *
	 * @param view the main.view
	 */
	public TelaClienteController(TelaCliente view) {
		this.view = view;
	}

	private static DB dados;

	private JList<String> listaClientesCadastrados;

	private String[] listaClientes = new String[20];

	/**
	 * Executar botao.
	 *
	 * @param botao the botao
	 */
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

		}
	}

	/**
	 * Criar dados jlist default list main.model.
	 *
	 * @return the default list main.model
	 */
	public DefaultListModel criarDadosJlist(){
		listaClientesCadastrados = new JList<String>(listaClientes);
		return criarDadosJlist();
	}
}


package controller;

import model.Cliente;
import model.DB;
import model.Oculos;
import view.TelaOculos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TelaOculosController {
    private final TelaOculos view;

    public TelaOculosController(TelaOculos view){this.view = view;}
    public void executarBotao(ActionEvent botao) {
        JButton botaoApertado = (JButton) botao.getSource();

        if (botaoApertado == this.view.getCadastro()) {
            String valorNome = view.getValorNome().getText();
            String valorCpf = view.getValorCpf().getText();

            Cliente cliente = new Cliente();

            cliente.setNomeCliente(valorNome);
            cliente.setCpf(valorCpf);
            cliente.setCep("15456");
            cliente.setTelefone("15545454");

            DB.getListaclientes().add(cliente);
        }

        System.out.println(DB.getListaclientes());
    }
}

package main.controller;

import main.view.TelaVenda;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * The type Tela venda main.controller.
 */
public class TelaVendaController {
    private final TelaVenda view;

    /**
     * Instantiates a new Tela venda main.controller.
     *
     * @param view the main.view
     */
    public TelaVendaController(TelaVenda view){
        this.view = view;
    }

    /**
     * Executar botao.
     *
     * @param botao the botao
     */
    public void executarBotao(ActionEvent botao){
        JButton botaoApertado = (JButton) botao.getSource();
    }
}

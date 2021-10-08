package controller;

import view.TelaVenda;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.DB;
import view.TelaVenda;

/**
 * The type Tela venda controller.
 */
public class TelaVendaController {
    private final TelaVenda view;

    /**
     * Instantiates a new Tela venda controller.
     *
     * @param view the view
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

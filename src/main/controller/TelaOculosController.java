package main.controller;

import main.model.DB;
import main.model.Produto;
import main.view.TelaOculos;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * The type Tela oculos main.controller.
 */
public class TelaOculosController {
    private final TelaOculos view;

    /**
     * Instantiates a new Tela oculos main.controller.
     *
     * @param view the main.view
     */
    public TelaOculosController(TelaOculos view){this.view = view;}

    /**
     * Executar botao.
     *
     * @param botao the botao
     */
    public void executarBotao(ActionEvent botao) {
        JButton botaoApertado = (JButton) botao.getSource();

        if (botaoApertado == this.view.getOculosButton()) {
            Produto produto = new Produto(){};
            DB.getListaProdutos().add(produto);
        }
        System.out.println(DB.getListaProdutos());
    }
}

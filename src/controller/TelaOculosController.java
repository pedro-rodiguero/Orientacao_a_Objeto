package controller;

import model.DB;
import model.Produto;
import view.TelaOculos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TelaOculosController {
    private final TelaOculos view;

    public TelaOculosController(TelaOculos view){this.view = view;}

    public void executarBotao(ActionEvent botao) {
        JButton botaoApertado = (JButton) botao.getSource();

        if (botaoApertado == this.view.getOculosButton()) {
            Produto produto = new Produto(){};
            DB.getListaProdutos().add(produto);

            System.out.println("asadads");
        }
        System.out.println(DB.getListaProdutos());
    }
}

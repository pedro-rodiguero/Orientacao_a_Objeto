package controller;

import view.TelaVenda;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.DB;
import view.TelaVenda;

public class TelaVendaController {
    private final TelaVenda view;

    public TelaVendaController(TelaVenda view){
        this.view = view;
    }

    public void executarBotao(ActionEvent botao){
        JButton botaoApertado = (JButton) botao.getSource();
    }
}

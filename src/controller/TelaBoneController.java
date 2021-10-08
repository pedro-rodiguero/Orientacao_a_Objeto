package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Bone;
import model.DB;
import model.Produto;
import view.TelaBone;

public class TelaBoneController {
    private final TelaBone view;

    public TelaBoneController(TelaBone view){
        this.view = view;
    }

    public void executarBotao(ActionEvent botao){
        String valorTamanho = view.getValorTamanho().getText();

        Produto produto = new Produto(){};
        Bone bone = new Bone();

        bone.setTamanho(valorTamanho);

        DB.getListaProdutos().add(produto);

        System.out.println(DB.getListaProdutos());
    }
}

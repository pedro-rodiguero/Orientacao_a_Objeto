package main.controller;

import java.awt.event.ActionEvent;

import main.model.Bone;
import main.model.DB;
import main.model.Produto;
import main.view.TelaBone;

/**
 * The type Tela bone main.controller.
 */
public class TelaBoneController {
    private final TelaBone view;

    /**
     * Instantiates a new Tela bone main.controller.
     *
     * @param view the main.view
     */
    public TelaBoneController(TelaBone view){
        this.view = view;
    }

    /**
     * Executar botao.
     *
     * @param botao the botao
     */
    public void executarBotao(ActionEvent botao){
        String valorTamanho = view.getValorTamanho().getText();

        Produto produto = new Produto(){};
        Bone bone = new Bone();

        bone.setTamanho(valorTamanho);

        DB.getListaProdutos().add(produto);

        System.out.println(DB.getListaProdutos());
    }
}

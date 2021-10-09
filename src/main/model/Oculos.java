package main.model;

/**
 * Classe para representar a classe Oculos.
 *
 * @author Pedro /Lucas
 * @version TP.05
 */
public class Oculos extends Produto {

    private String tamanho;

    /**
     * Instancia um novo Oculos.
     *
     * @param modelo     the modelo
     * @param cor        the cor
     * @param qntEstoque the qnt estoque
     * @param valor      the valor
     * @param tamanho    the tamanho
     */
    public Oculos(String modelo, String cor, int qntEstoque, Long valor, String tamanho) {
		super(modelo, cor, qntEstoque, valor);
		this.tamanho = tamanho;
	}

    /**
     * Get tamanho.
     *
     * @return tamanho tamanho
     */
    public String getTamanho() {
		return tamanho;
	}

    /**
     * Set tamanho.
     *
     * @param tamanho the tamanho
     */
    public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}

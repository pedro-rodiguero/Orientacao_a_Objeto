package model;

/**
 * Classe para representar a classe Oculos.
 * @author Pedro/Lucas
 * @version TP.05
 */

public class Oculos extends Produto {

    private String tamanho;

	/**
	 * Instancia um novo Oculos.
	 * @param modelo 
	 * @param cor 
	 * @param qntEstoque 
	 * @param valor 
	 * @param tamanho 
	 */
	public Oculos(String modelo, String cor, int qntEstoque, Long valor, String tamanho) {
		super(modelo, cor, qntEstoque, valor);
		this.tamanho = tamanho;
	}

	/**
	 * Get tamanho.
	 * @return tamanho
	 */
	public String getTamanho() {
		return tamanho;
	}

	/**
	 * Set tamanho.
	 * @param tamanho 
	 */
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}

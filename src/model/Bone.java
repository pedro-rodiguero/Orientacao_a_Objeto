package model;

/**
 * Classe para respresentar a classe Bone na loja.
 * @author Pedro/Lucas
 * @version TP.05
 */

public class Bone extends Produto {
	
	private String tamanho;

	/**
	 * Instancia um novo Bone
	 * @param modelo 
	 * @param cor 
	 * @param qntEstoque 
	 * @param valor 
	 * @param tamanho 
	 */
	public Bone(String modelo, String cor, int qntEstoque, Long valor, String tamanho) {
		super(modelo, cor, qntEstoque, valor);
		this.tamanho = tamanho;
	}

	public Bone(){}

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

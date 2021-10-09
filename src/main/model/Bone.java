package main.model;

/**
 * Classe para respresentar a classe Bone na loja.
 *
 * @author Pedro /Lucas
 * @version TP.05
 */
public class Bone extends Produto {
	
	private String tamanho;

    /**
     * Instancia um novo Bone
     *
     * @param modelo     the modelo
     * @param cor        the cor
     * @param qntEstoque the qnt estoque
     * @param valor      the valor
     * @param tamanho    the tamanho
     */
    public Bone(String modelo, String cor, int qntEstoque, Long valor, String tamanho) {
		super(modelo, cor, qntEstoque, valor);
		this.tamanho = tamanho;
	}

    /**
     * Instantiates a new Bone.
     */
    public Bone(){}

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

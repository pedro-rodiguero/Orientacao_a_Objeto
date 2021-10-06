package dados;

/**
 * Classe para fazer os setters e getters do produto
 * @author Pedro /Lucas
 * @version TP.05
 */
public abstract class Produto {

    protected String modelo;
    protected String cor;
    protected int qntEstoque;
    protected Long valor;
    protected String tipoProduto;

    /**
     * Instancia um novo Produto.
     */
    public Produto(){}

    /**
     * Instancia um novo Produto.
     * @param modelo      the modelo
     * @param cor         the cor
     * @param qntEstoque  the qnt estoque
     * @param valor       the valor
     * @param tipoProduto the tipo produto
     */
    public Produto(String modelo, String cor, int qntEstoque, Long valor, String tipoProduto){
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }

    /**
     * Instancia um novo Produto.
     * @param modelo     the modelo
     * @param cor        the cor
     * @param qntEstoque the qnt estoque
     * @param valor      the valor
     */
    public Produto(String modelo, String cor, int qntEstoque, Long valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;    }

    /**
     * Set modelo.
     * @param modelo the modelo
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Set cor.
     * @param cor the cor
     */
    public void setCor(String cor){
        this.cor = cor;
    }

    /**
     * Set qnt estoque.
     * @param qntEstoque the qnt estoque
     */
    public void setQntEstoque(int qntEstoque){
        this.qntEstoque = qntEstoque;
    }

    /**
     * Get valor long.
     * @return the long
     */
    public Long getValor(){
        return valor;
    }

    /**
     * Sets tipo produto.
     * @param tipoProduto the tipo produto
     */
    public void setTipoProduto(String tipoProduto) {
    	this.tipoProduto = tipoProduto;
    }
}

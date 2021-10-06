package dados;

/**
 * Classe para fazer os setters e getters da venda
 * @author Pedro /Lucas
 * @version TP.05
 */

public class Venda {

    protected int qntProduto;
    protected int id;
    protected Long valor;

    /**
     * Instancia uma nova Venda.
     */
    public Venda(){}

    /**
     * Construtor de uma nova venda
     * @param qntProduto
     * @param id
     * @param valor
     */
    public Venda( int qntProduto, int id, Long valor){

        this.qntProduto = qntProduto;
        this.id = id;
        this.valor = valor;
    }

    /**
     * Set qnt produto.
     * @param qntProduto
     */
    public void setQntProduto(int qntProduto){
        this.qntProduto = qntProduto;
    }

    /**
     * Get qnt produto integer.
     * @param qntProduto
     * @return qntProduto, quantos produtos foram comprados
     */
    public Integer getQntProduto(int qntProduto){
        return qntProduto;
    }

    /**
     * Set id.
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Get id integer.
     * @param id
     * @return id, id da venda (cupom fiscal)
     */
    public Integer getId(int id){
        return id;
    }

    /**
     * Set valor.
     * @param valor the valor
     */
    public void setvalor(Long valor){
        this.valor = valor;
    }

    /**
     * Get valor long.
     * @return valor, valor final da venda
     */
    public Long getValor(){
        return valor;
    }
}

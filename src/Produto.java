public abstract class Produto {

    protected String modelo;
    protected String cor;
    protected int qntEstoque;
    protected Long valor;
    protected boolean tipoProduto;


    public Produto( String modelo, String cor, int qntEstoque, Long valor, boolean tipoProduto){
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setQntEstoque(int qntEstoque){
        this.qntEstoque = qntEstoque;
    }

    public Long getValor(){
        return valor;
    }
    
    public void setTipoProduto() {
    	this.tipoProduto = tipoProduto;
    	
    }
}
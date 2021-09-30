package dados;

public abstract class Produto {

    protected String modelo;
    protected String cor;
    protected int qntEstoque;
    protected Long valor;
    protected String tipoProduto;

    //TODO ATUALIZAR UML - atributos agora sao protected, nao private

    public Produto(){}

    public Produto(String modelo, String cor, int qntEstoque, Long valor, String tipoProduto){
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }

    public Produto(String modelo, String cor, int qntEstoque, Long valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;    }

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
    
    public void setTipoProduto(String tipoProduto) {
    	this.tipoProduto = tipoProduto;
    	
    }
}
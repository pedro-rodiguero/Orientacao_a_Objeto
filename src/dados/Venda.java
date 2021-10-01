package dados;

public class Venda {
    protected int qntProduto;
    protected int id;
    protected Long valor;

    public Venda(){}

    public Venda( int qntProduto, int id, Long valor){

        this.qntProduto = qntProduto;
        this.id = id;
        this.valor = valor;
    }

    public void setQntProduto(int qntProduto){
        this.qntProduto = qntProduto;
    }

    public Integer getQntProduto(int qntProduto){
        return qntProduto;
    }

    public void setId(int id){
        this.id = id;
    }

    public Integer getId(int id){
        return id;
    }

    public void setvalor(Long valor){
        this.valor = valor;
    }

    public Long getValor(){
        return valor;
    }
}
package dados;

public class Venda {
    protected int qntProduto;
    protected int id;
    protected Long valor;

    //TODO ATUALIZAR UML - atributos agora sao protected, nao private

    public Venda(){}

    public Venda( int qntProduto, int id, Long valor){

        this.qntProduto = qntProduto;
        this.id = id;
        this.valor = valor;
    }

    public void setqntProduto(int qntProduto){
        this.qntProduto = qntProduto;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setvalor(Long valor){
        this.valor = valor;
    }

    public Long getValor(){
        return valor;
    }
}
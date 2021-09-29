public class Venda {
    private int qntProduto;
    private String id;
    private Long valor;

    public Venda( int qntProduto, String id, Long valor){

        this.qntProduto = qntProduto;
        this.id = id;
        this.valor = valor;
    }

    public void setqntProduto(int qntProduto){
        this.qntProduto = qntProduto;
    }

    public void setid(String id){
        this.id = id;
    }

    public void setvalor(Long valor){
        this.valor = valor;
    }

    public Long getValor(){
        return valor;
    }
}
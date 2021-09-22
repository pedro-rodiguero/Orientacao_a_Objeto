public abstract class Produto {

    private String modelo;
    private String cor;
    private int qntEstoque;
    private Long valor;


    public Produto( String modelo, String cor, int qntEstoque, Long valor){
        this.modelo = modelo;
        this.cor = cor;
        this.qntEstoque = qntEstoque;
        this.valor = valor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setGenero(int qntEstoque){
        this.qntEstoque = qntEstoque;
    }

    public Long getValor(){
        return valor;
    }
}
public class Loja {
    private String nomeLoja;
    private String cnpj;
    private Long qtdeEmEstoque;

    public Loja(String nomeLoja, String cnpj, Long qtdeEmEstoque){
        this.nomeLoja = nomeLoja;
        this.cnpj = cnpj;
        this.qtdeEmEstoque = qtdeEmEstoque;
    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public Long getQtdeEmEstoque(){
        return qtdeEmEstoque;
    }
}

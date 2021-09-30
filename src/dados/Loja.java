package dados;

public class Loja {
    protected String nomeLoja;
    protected String cnpj;

    public Loja(){}

    public Loja(String nomeLoja, String cnpj ){
        this.nomeLoja = nomeLoja;
        this.cnpj = cnpj;

    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}

public class Cliente {
    protected String nome;
    protected String cpf;
    protected String cep;
    protected String telefone;

    public Cliente(){}

    public Cliente(String nome, String cpf, String cep, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void setNomeCliente(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
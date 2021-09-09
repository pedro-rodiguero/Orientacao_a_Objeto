public class Cliente {
    private String nomeCliente;
    private String cpf;
    private String cep;
    private String telefone;

    public Cliente(String nomeCliente, String cpf, String cep, String telefone){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
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

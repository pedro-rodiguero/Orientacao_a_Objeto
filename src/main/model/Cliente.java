package main.model;

/**
 * Classe para representar a classe Cliente.
 *
 * @author Pedro /Lucas
 * @version TP.05
 */
public class Cliente {

	private String nome;
	private String cpf;
	private String cep;
	private String telefone;

	/**
	 * Instancia um novo cliente.
	 */
	public Cliente() {
	}

	/**
	 * Instancia um novo cliente.
	 *
	 * @param nome     the nome
	 * @param cpf      the cpf
	 * @param cep      the cep
	 * @param telefone the telefone
	 */
	public Cliente(String nome, String cpf, String cep, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
		this.telefone = telefone;
	}

	/**
	 * Set nome cliente.
	 *
	 * @param nome cliente
	 */
	public void setNomeCliente(String nome) {
		this.nome = nome;
	}

	/**
	 * Get nome cliente.
	 *
	 * @return nome cliente
	 */
	public String getNomeCliente() {
		return nome;
	}

	/**
	 * Set cpf.
	 *
	 * @param cpf the cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Get cpf.
	 *
	 * @return cpf cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Set cep.
	 *
	 * @param cep the cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Get cep.
	 *
	 * @param cep the cep
	 * @return cep cep
	 */
	public String getCep(String cep) {
		return cep;
	}

	/**
	 * Set telefone.
	 *
	 * @param telefone the telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Get telefone.
	 *
	 * @param telefone the telefone
	 * @return telefone telefone
	 */
	public String getTelefone(String telefone) {
		return telefone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", telefone=" + telefone + "]";
	}

}

package product;
/**
 * Classe cliente que define as os atributos de cadas cliente
 * @author pedrohbcavalcante
 * @version 0.1
 * 
 */
public class Cliente {
	private String nome;
	private String idade;
	private String CPF;
	private String RG;
	/**
	 * 
	 * @param nome nome do cliente
	 * @param idade idade do cliente
	 * @param CPF cpf do cliente
	 * @param RG rg do cliente
	 * 
	 * Classe construtora
	 */
	public Cliente(String nome, String idade, String CPF, String RG) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.RG = RG;
	}
	/**
	 * 
	 * @return o nome do cliente
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * @param nome seta o nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return a idade do cliente
	 */
	public String getIdade() {
		return idade;
	}
	/**
	 * 
	 * @param idade seta a idade do cliente
	 */
	public void setIdade(String idade) {
		this.idade = idade;
	}
	/**
	 * 
	 * @return o CPF do cliente
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * 
	 * @param CPF seta o valor do CPF do cliente
	 */
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	/**
	 * 
	 * @return o valor do RG de cada cliente
	 */
	public String getRG() {
		return RG;
	}
	/**
	 * 
	 * @param RG seta o RG do cliente
	 */
	public void setRG(String RG) {
		this.RG = RG;
	}
	
	
}

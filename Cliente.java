package product;

public class Cliente {
	private String nome;
	private String idade;
	private String CPF;
	private String RG;
	
	public Cliente(String nome, String idade, String CPF, String RG) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.RG = RG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}
	
	
}

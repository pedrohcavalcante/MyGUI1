package product;

public class Fornecedor {
	private int Codigo;
	private String Nome;
	private String CNPJ;
	public Fornecedor(int codigo, String nome, String cNPJ) {
		Codigo = codigo;
		Nome = nome;
		CNPJ = cNPJ;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}

package product;

public class Produto {
	private int ID;
	private String nome;
	private String unidade;

	public Produto(int iD, String nome, String unidade) {
		ID = iD;
		this.nome = nome;
		this.unidade = unidade;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

}

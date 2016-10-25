package product;
/**
 * Essa classe possue as definições de cada produto
 * @author pedrohbcavalcante
 * @version 0.1
 * 
 */
public class Produto {
	private int ID;
	private String nome;
	private String unidade;
	/**
	 * Classe construtora
	 * @param iD id do produto
	 * @param nome nome do produto
	 * @param unidade unidade de medida do produto
	 */
	public Produto(int iD, String nome, String unidade) {
		ID = iD;
		this.nome = nome;
		this.unidade = unidade;
	}
	/**
	 * 
	 * @return o id de cada produto
	 */
	public int getID() {
		return ID;
	}
	/**
	 * 
	 * @param iD seta o valor do ID de cada produto
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * 
	 * @return retorna o nome de cada produto
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * @param nome seta o nome de cada produto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return retorna o nome unidade de medida de cada produto
	 */
	public String getUnidade() {
		return unidade;
	}
	/**
	 * 
	 * @param unidade seta a unidade de medida de cada produto
	 */
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

}

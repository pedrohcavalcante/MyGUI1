package product;
/**
 * Classe que define os parametros de cada fornecedor
 * @author pedrohbcavalcante
 * @version 0.1
 * 
 */
public class Fornecedor {
	private int Codigo;
	private String Nome;
	private String CNPJ;
	/**
	 * 
	 * @param codigo codigo unico para cada fornecedor (falta implementar)
	 * @param nome nome de cada fornecedor
	 * @param cNPJ valor do CNPJ de cada fornecedor
	 */
	public Fornecedor(int codigo, String nome, String cNPJ) {
		Codigo = codigo;
		Nome = nome;
		CNPJ = cNPJ;
	}
	/**
	 * 
	 * @return o valor do codigo de cada fornecedor
	 */
	public int getCodigo() {
		return Codigo;
	}
	/**
	 * 
	 * @param codigo seta o valor do codigo de cada fornecedor
	 */
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	/**
	 * 
	 * @return o nome de cada fornecedor
	 */
	public String getNome() {
		return Nome;
	}
	/**
	 * 
	 * @param nome seta o nome de cada fornecedor
	 */
	public void setNome(String nome) {
		Nome = nome;
	}
	/**
	 * 
	 * @return retorna o CNPJ de cada fornecedor
	 */
	public String getCNPJ() {
		return CNPJ;
	}
	/**
	 * 
	 * @param cNPJ seta o CNPJ de cada fornecedor
	 */
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
}

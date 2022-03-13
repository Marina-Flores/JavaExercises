package ListaOO_01.Q12;

public class Editora {
	private String CNPJ;
	private String Nome;
	private String Endereco;
	private String Telefone;
	
	public Editora(String cnpj, String nome, String endereco, String telefone) {
		this.CNPJ = cnpj;
		this.Nome = nome;
		this.Endereco = endereco;
		this.Telefone = telefone;
	}


	public String getCNPJ() {
		return CNPJ;
	}

	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getEndereco() {
		return Endereco;
	}


	public void setEndereco(String endereco) {
		Endereco = endereco;
	}


	public String getTelefone() {
		return Telefone;
	}


	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
}

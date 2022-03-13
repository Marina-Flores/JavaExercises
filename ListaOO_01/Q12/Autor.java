package ListaOO_01.Q12;

public class Autor {
	private String Nome;
	private String CPF;
	private String Endereco;
	
	public Autor(String nome, String cpf, String endereco){
		this.Nome = nome;
		this.CPF = cpf;
		this.Endereco = endereco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	
}

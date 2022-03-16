package ListaOO_01.Q15;

public class Funcionario {
	private String Nome; 
	private String Endereco;
	private String Telefone;
	private String CPF;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf) {
		this.Nome = nome;
		this.Endereco = endereco;
		this.Telefone = telefone;
		this.CPF = cpf;
	}
	
	public Funcionario() { }

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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}

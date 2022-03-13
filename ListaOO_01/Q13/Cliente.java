package ListaOO_01.Q13;

public class Cliente {
	private String Nome;
	private String CPF;
	
	public Cliente(String nome, String cpf) {
		this.Nome = nome;
		this.CPF = cpf;
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
	
	@Override
	public String toString() {
		return " Nome do Cliente: " + this.Nome + 
				"\n CPF do Cliente: " + this.CPF;
	}
}

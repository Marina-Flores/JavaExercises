package ListaOO_01.Q13;

public class Banco {
	private String NomeAgencia;
	private int NumeroAgencia;
	
	public Banco(String nomeAgencia, int numeroAgencia) {
		this.NomeAgencia = nomeAgencia;
		this.NumeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return NomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		NomeAgencia = nomeAgencia;
	}

	public int getNumeroAgencia() {
		return NumeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		NumeroAgencia = numeroAgencia;
	}
	
	@Override
	public String toString() {
		return " Nome da Ag�ncia: " + this.NomeAgencia + 
			   "\n N�mero da Ag�ncia: " + this.NumeroAgencia;	
	}
	
}

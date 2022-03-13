package ListaOO_01.Q14;

public class Estudante {
	private String Matricula;
	private String Nome; 
	private double[] Notas = new double[4];
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.Matricula = matricula;
		this.Nome = nome;
		this.Notas = notas;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double[] getNotas() {
		return Notas;
	}

	public void setNotas(double[] notas) {
		Notas = notas;
	}
	
	public double CalcularMedia() {
		double soma = 0;
		for(int i = 0; i < this.Notas.length; i++) {
			soma += this.Notas[i];
		}		
		return (soma / 4);
	}
	
	@Override
	public String toString() {
		return "\n ----------------------- \n" +
				"Nome: " + this.Nome + "\n" +
				"Matrícula: " + this.Matricula + "\n";
	}
	
}

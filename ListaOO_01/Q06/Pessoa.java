package ListaOO_01.Q06;

public class Pessoa {
	private String Nome; 
	private double Altura;
	private double Peso;
	
	public Pessoa(String nome, double altura, double peso) {
		this.Nome = nome;
		this.Altura = altura;
		this.Peso = peso;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public double getAltura() {
		return this.Altura;
	}
	
	public void setAltura(double altura) {
		this.Altura = altura;
	}
	
	public double getPeso() {
		return this.Peso;
	}
	
	public void setPeso(double peso) {
		this.Peso = peso;
	}
	
	public double calcularIMC() {
		return this.Peso / (this.Altura * this.Altura);
	}
	
	
	
}

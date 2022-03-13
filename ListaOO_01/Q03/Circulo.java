package ListaOO_01.Q03;

public class Circulo {
	
	public Circulo(double raio) {
		this.Raio = raio;
	}
	
	public Circulo() { }
	
	private double Raio;
	private double PI = 3.14;
	
	public void setRaio(double raio) {
		this.Raio = raio;
	}
	
	public double calcularArea() {
		return this.PI * Math.pow(Raio, 2);
	}
	
	public double calcularPerimetro() {
		return 2 * this.PI * this.Raio;
	}
}

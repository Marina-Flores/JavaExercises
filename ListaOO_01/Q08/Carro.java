package ListaOO_01.Q08;

public class Carro {

	private double Eficiencia;	
	private double Combustivel; 
	
	public Carro(double eficiencia, double combustivel) {
		this.Eficiencia = eficiencia;
		this.Combustivel = combustivel;
	}
	
	public double getEficiencia() {
		return this.Eficiencia;
	}
	
	public void setEficiencia(double eficiencia) {
		this.Eficiencia = eficiencia;
	}
	
	public double getCombustivel() {
		return this.Combustivel;
	}
	
	public void setCombustivel(double combustivel) {
		this.Combustivel = combustivel;
	}
	
	public void Andar(double km) {
		if(this.Combustivel >= (km / this.Eficiencia)) {
			this.Combustivel -= (km / this.Eficiencia);
		}
		else {
			System.out.println("Combustível insuficiênte. Abasteça o carro para prosseguir!");
		}
	}
	
	public void Reabastecer(double litros) {
		this.Combustivel += litros;
		System.out.println("Carro reabastecido!");
	}
}

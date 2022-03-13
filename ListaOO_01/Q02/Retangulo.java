package ListaOO_01.Q02;

public class Retangulo {
	
	public Retangulo(double base, double altura) {
		this.Base = base; 
		this.Altura = altura;
	}
	
	public Retangulo() { }
	
	private double Base; 
	private double Altura;

	public double getBase() {
		return this.Base;
	}
	
	public void setBase(double base) {
		this.Base = base; 
	}
	
	public double getAltura() {
		return this.Altura;
	}
	
	public void setAltura(double altura) {
		this.Altura = altura;
	}
	
	public double calcularArea() {
		return this.Altura * this.Base;
	}
	
	public double obterPerimetro() {
		return (this.Altura * 2) + (this.Base * 2);
	}

}

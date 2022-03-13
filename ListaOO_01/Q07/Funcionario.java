package ListaOO_01.Q07;

import java.util.ArrayList;

public class Funcionario {
	private String Nome;
	private double Salario;
	
	public Funcionario(String nome, double salario) { 
		this.Nome = nome;
		this.Salario = salario;
	}
	
	public Funcionario() { }
	
	public String getNome() {
		return this.Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public double getSalario() {
		return this.Salario;
	}
	public void setSalario(double salario) {
		this.Salario = salario;
	}
	
	public double calculaImposto(ArrayList<Funcionario> funcionarios, String nome) {
		for(Funcionario f : funcionarios) {
			if(f.Nome.equals(nome)) {
				if(f.Salario >= 2000.01 && f.Salario <= 3500) {
					return (f.Salario * 0.15);
				}
				else if(f.Salario >= 3500.01 && f.Salario <= 5000) {
					return (f.Salario * 0.22);
				}
				else if(f.Salario > 5000.01) {
					return (f.Salario * 0.30);
				}				
			}		
		}
		return 0.0;
	}	
}

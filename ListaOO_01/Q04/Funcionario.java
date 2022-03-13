package ListaOO_01.Q04;

import java.util.ArrayList;

public class Funcionario {

	private String Nome; 
	private double Salario;
	
	public Funcionario(String nome, double salario) {
		this.Nome = nome;
		this.Salario = salario;
	}
	
	public Funcionario() {
		
	}
	
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
	
	public void getFuncionariosAltaRenda(ArrayList<Funcionario> funcionarios){
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.Salario > 5000) {
				System.out.println(funcionario.Nome);
			}
		}		
	}
}

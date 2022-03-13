package ListaOO_01.Q05;

import java.util.ArrayList;

public class Estudante {
	
	public Estudante(String nome, String matricula, double[] notas) {
		this.Nome = nome; 
		this.Matricula = matricula; 
		this.Notas = notas;
	}
	
	public Estudante() { }
	
	private String Nome;
	private String Matricula;
	private double[] Notas = new double[2];
	
	public String getNome() {
		return this.Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public String getMatricula() {
		return this.Matricula;
	}
	
	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}
	
	public double[] getNotas() {
		return this.Notas;
	}
	
	public void setNotas(double[] notas) {
		this.Notas = notas; 
	}
	
	public void calculaMedia(ArrayList<Estudante> estudantes, String matricula) {
		double soma = 0;
		for(Estudante e : estudantes) {
			if(matricula == e.Matricula) {
				for(int i = 0; i < e.Notas.length; i++) {
					soma+= e.Notas[i];
				}				
				double media = soma / 2;
				if(media >= 7) {
					System.out.println("O estudante foi aprovado! Média: " + media);
				}
				else {
					System.out.println("O estudante não foi aprovado! Média: " + media);
				}
			}
			else {
				System.out.println("Não há nenhum estudante matriculado com essa matrícula");
			}
		}		
	}	
}

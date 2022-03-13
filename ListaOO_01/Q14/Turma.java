package ListaOO_01.Q14;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private String Nome;
	private String Codigo;
	private ArrayList<Estudante> Estudantes = new ArrayList<Estudante>();
	
	public Turma(String nome, String codigo) {
		this.Nome = nome;
		this.Codigo = codigo;
	}
	public Turma() {}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public ArrayList<Estudante> getEstudantes() {
		return Estudantes;
	}

	public void setEstudantes(Estudante estudantes) {
		Estudantes.add(estudantes);
	}
	
	public void EstudanteTurma(ArrayList<Turma> turmas, String codigo) {
		for(Turma t : turmas) {
			if(t.Codigo.equals(codigo)) {
				for(Estudante e : t.Estudantes) {
					System.out.println(e);
				}
			}
			else {
				System.out.println("Nenhuma turma com esse c�digo foi encontrada!");
			}
		}
	}
	
	public void ConsultarMedia(ArrayList<Turma> turmas, String codigo, String matricula) {
		for(Turma t : turmas) {
			if(t.Codigo.equals(codigo)) {
				for(Estudante e : t.Estudantes) {
					if(e.getMatricula().equals(matricula)) {
						System.out.println("A m�dia do aluno � de " + e.CalcularMedia());
					}
					else {
						System.out.println("N�o foi encontrado nenhum aluno com essa matr�cula!");
					}
				}
			}
			else {
				System.out.println("N�o foi encontrada nenhuma turma com esse c�digo!");
			}
		}
	}

	public void AlterarNotas(ArrayList<Turma> turmas, String codigo, String matricula) {
		Scanner sc = new Scanner(System.in);
		for(Turma t : turmas) {
			if(t.Codigo.equals(codigo)) {
				for(Estudante e : t.Estudantes) {
					if(e.getMatricula().equals(matricula)) {
						double[] notas = new double[4];
						for(int i = 0; i < e.getNotas().length; i++) {
							System.out.print("Informe a " + (i+1) + "� nota: ");
							double nota = sc.nextDouble();
							notas[i] = nota;
						}
						e.setNotas(notas);
						System.out.println("Notas atualizadas!");
						break;
					}
					else {
						System.out.println("N�o foi encontrado nenhum aluno com essa matr�cula!");
					}
				}
			}
			else {
				System.out.println("N�o foi encontrada nenhuma turma com esse c�digo!");
			}
		}
	}

	public void ConsultarMediaTurma(ArrayList<Turma> turmas, String codigo) {
		double soma = 0;
		int totalAlunos = 0;
		for(Turma t : turmas) {
			if(t.Codigo.equals(codigo)) {
				totalAlunos = t.Estudantes.size();
				for(Estudante e : t.Estudantes) {
					soma += e.CalcularMedia();
				}
				System.out.println("A m�dia da turma � de: " + (soma / totalAlunos));
				break;
			}
			else {
				System.out.println("N�o foi encontrada nenhuma turma com esse c�digo!");
			}
		}
	}

	public Turma BuscarTurma(ArrayList<Turma> turmas, String codigo) {
		for(Turma t : turmas) {
			if(t.Codigo.equals(codigo)) {
				return t;
			}
			else {
				System.out.println("N�o foi encontrada nenhuma turma com esse c�digo!");
			}				
		}
		return new Turma();
	}
	
	@Override
	public String toString() {
		return "\n -------------------- \n "
				+ "Turma: " + this.Nome + 
				"\n C�digo: " + this.Codigo + "\n";
	}
}

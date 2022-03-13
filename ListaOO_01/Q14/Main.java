package ListaOO_01.Q14;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import ListaOO_01.Q09.Livro;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Turma                                   ");
		System.out.println("2 - Cadastrar Estudante 							  ");
		System.out.println("3 - Listar Turmas	                                  ");
		System.out.println("4 - Listar Estudantes por turma                       ");
		System.out.println("5 - Consultar média de um estudante                   ");
		System.out.println("6 - Alterar notas de um estudante                     ");
		System.out.println("7 - Exibir média dos estudantes de uma turma          ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Turma cadastrarTurma() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o código da turma: ");
		String codigo = sc.nextLine();
		
		System.out.print("Informe o nome da turma: ");
		String nome = sc.nextLine();
		
		Turma turma = new Turma(nome, codigo);
		return turma;	
	}
	
	private static Estudante cadastrarEstudante() {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[4];
		System.out.print("Informe o nome do estudante: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe a matrícula do estudante: ");
		String matricula = sc.nextLine();
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (i+1) + "ª nota: ");
			notas[i] = sc.nextDouble();
		}
		
		Estudante estudante = new Estudante(matricula, nome, notas);
		return estudante;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		Turma turma = new Turma();
		String codigo, matricula;
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar uma turma selecionada!");
					turma = cadastrarTurma();
					turmas.add(turma);			
					break;
				case 2:
					System.out.println("Opção de cadastrar estudante selecionada!");
					System.out.println("Informe o código da turma: ");
					codigo = sc.next();
					Turma t = turma.BuscarTurma(turmas, codigo);
					if(!Objects.isNull(t)) {
						Estudante e = cadastrarEstudante();
						t.setEstudantes(e);
						System.out.println("Estudante cadastrado com sucesso!");
					}
					else {
						System.out.println("Turma não encontrada.");
					}					
					break;	
				case 3: 
					System.out.println("Opção de listar turmas selecionada!");
					System.out.println(turmas);					
					break;
				case 4: 
					System.out.println("Opção de listar estudantes por turma selecionada!");
					System.out.println("Informe o código da turma: ");
					codigo = sc.next();					
					turma.EstudanteTurma(turmas, codigo);
					break;
				case 5: 
					System.out.println("Opção de consultar média de um estudante selecionada!");
					System.out.println("Informe o código da turma: ");
					codigo = sc.next();
					System.out.println("Informe a matrícula do estudante: ");
					matricula = sc.next();					
					turma.ConsultarMedia(turmas, codigo, matricula);
				case 6: 
					System.out.println("Opção de alterar notas de um estudante selecionada!");
					System.out.println("Informe o código da turma: ");
					codigo = sc.next();
					System.out.println("Informe a matrícula do estudante: ");
					matricula = sc.next();					
					turma.AlterarNotas(turmas, codigo, matricula);
					break;
				case 7:
					System.out.println("Opção de consultar média de uma turma selecionada!");
					System.out.println("Informe o código da turma: ");
					codigo = sc.next();
					turma.ConsultarMediaTurma(turmas, codigo);
					break;
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	

	}

}

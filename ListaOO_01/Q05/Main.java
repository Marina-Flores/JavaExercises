package ListaOO_01.Q05;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Opções                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Cadastrar estudante           		|");
		System.out.println("| 2 - Obter nome do estudante            	|");
		System.out.println("| 3 - Calcular média                     	|");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}
	
	private static Estudante cadastrarEstudante() {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[2];
		
		System.out.print("Informe o nome do Estudante: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe a matrícula do Estudante: ");
		String matricula = sc.nextLine();
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i+1) + "ª nota do Estudante: ");
			notas[i] = sc.nextDouble();
		}
		
		Estudante estudante = new Estudante(nome, matricula, notas);
		return estudante;
	}
	
	private static String obterNome(ArrayList<Estudante> estudantes, String matricula) {
		for(Estudante e : estudantes) {
			if(matricula == "2016") {
				return e.getNome(); 
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				ArrayList<Estudante> estudantes = new ArrayList();
				Estudante e = new Estudante();
				short opcao = 50;		
				do{
					exibirMenu();
					System.out.print("Opção escolhida: ");
					opcao = sc.nextShort();
					
					switch(opcao){
						case 1:
							System.out.println("Opção de cadastrar um estudante selecionada!");
							Estudante estudante = cadastrarEstudante();
							estudantes.add(estudante);			
							break;
						case 2:
							System.out.println("Opção de obter nome do estudante selecionada!");
							System.out.println("Digite a matrícula do estudante");
							String matricula = sc.next();
							sc.nextLine();
							String nome = obterNome(estudantes, matricula);
							System.out.println("Nome: " + nome);
							break;
						case 3:
							System.out.println("Opção de calcular média do estudante selecionada!");
							System.out.println("Digite a matrícula do estudante");
							String m = sc.next();
							e.calculaMedia(estudantes, m);
							break;
						case 50:
							exibirMenu();
							break;
						default:
					}
				}while(opcao != 0); 	
	}

}

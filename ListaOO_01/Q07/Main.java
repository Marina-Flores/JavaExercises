package ListaOO_01.Q07;

import java.util.ArrayList;
import java.util.Scanner;

import ListaOO_01.Q06.Pessoa;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar pessoa                                  ");
		System.out.println("2 - Calcular imposto							      ");
		System.out.println("0 - Sair	         				                  ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Funcionario cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o salário do funcionário");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario);
		
		return funcionario; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario funcionario = new Funcionario();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar um funcionário selecionada!");
					funcionario = cadastrarFuncionario();
					funcionarios.add(funcionario);			
					break;
				case 2:
					System.out.println("Opção de mostrar as pessoas que estão abaixo do peso selecionada!");
					System.out.println("Informe o nome do funcionário que deseja calcular imposto: ");
					String nome = sc.next();
					double imposto = funcionario.calculaImposto(funcionarios, nome);					
					System.out.print("O imposto será de: " + imposto);
					break;				
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	
		
	}

}

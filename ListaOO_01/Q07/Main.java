package ListaOO_01.Q07;

import java.util.ArrayList;
import java.util.Scanner;

import ListaOO_01.Q06.Pessoa;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Op��es                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar pessoa                                  ");
		System.out.println("2 - Calcular imposto							      ");
		System.out.println("0 - Sair	         				                  ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Funcionario cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do funcion�rio: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o sal�rio do funcion�rio");
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
			System.out.print("Op��o escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Op��o de cadastrar um funcion�rio selecionada!");
					funcionario = cadastrarFuncionario();
					funcionarios.add(funcionario);			
					break;
				case 2:
					System.out.println("Op��o de mostrar as pessoas que est�o abaixo do peso selecionada!");
					System.out.println("Informe o nome do funcion�rio que deseja calcular imposto: ");
					String nome = sc.next();
					double imposto = funcionario.calculaImposto(funcionarios, nome);					
					System.out.print("O imposto ser� de: " + imposto);
					break;				
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	
		
	}

}

package ListaOO_01.Q04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Op��es                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Cadastrar funcion�rio           		|");
		System.out.println("| 2 - Exibir funcion�rios de alta renda  	|");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}		
	
	private static Funcionario cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do funcion�rio: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o sal�rio do funcion�rio: ");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario); 
		System.out.println("Funcion�rio cadastrado com sucesso!");
		
		return funcionario;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList();
		Funcionario f = new Funcionario();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Op��o escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Op��o de cadastrar um funcion�rio selecionada!");
					Funcionario funcionario = cadastrarFuncionario();
					funcionarios.add(funcionario);			
					break;
				case 2:
					System.out.println("Op��o de exibir funcion�rios de alta renda selecionada!");
					f.getFuncionariosAltaRenda(funcionarios);
					break;										
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	
	}

}

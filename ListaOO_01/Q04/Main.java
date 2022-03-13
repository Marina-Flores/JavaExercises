package ListaOO_01.Q04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Opções                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Cadastrar funcionário           		|");
		System.out.println("| 2 - Exibir funcionários de alta renda  	|");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}		
	
	private static Funcionario cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o salário do funcionário: ");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, salario); 
		System.out.println("Funcionário cadastrado com sucesso!");
		
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
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar um funcionário selecionada!");
					Funcionario funcionario = cadastrarFuncionario();
					funcionarios.add(funcionario);			
					break;
				case 2:
					System.out.println("Opção de exibir funcionários de alta renda selecionada!");
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

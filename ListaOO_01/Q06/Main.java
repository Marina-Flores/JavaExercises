package ListaOO_01.Q06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar pessoa                                  ");
		System.out.println("2 - Mostrar as pessoas que estão abaixo do peso       ");
		System.out.println("3 - Mostrar as pessoas que estão dentro do peso ideal ");
		System.out.println("4 - Mostrar as pessoas que estão acima do peso        ");
		System.out.println("0 - Sair	         				                  ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Pessoa cadastrarPessoa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome da pessoa: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe a altura da pessoa: ");
		double altura = sc.nextDouble();
		
		System.out.print("Informe o peso da pessoa: ");
		double peso = sc.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome, altura, peso);
		
		return pessoa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar uma pessoa selecionada!");
					Pessoa pessoa = cadastrarPessoa();
					pessoas.add(pessoa);			
					break;
				case 2:
					System.out.println("Opção de mostrar as pessoas que estão abaixo do peso selecionada!");
					for(Pessoa p : pessoas) {
						if(p.calcularIMC() < 18.5) {
							System.out.println(p.getNome() + "\n");
						}
					}
					break;
				case 3:
					System.out.println("Opção de mostrar as pessoas que estão dentro do peso ideal selecionada!");
					for(Pessoa p : pessoas) {
						if(p.calcularIMC() > 18.5 && p.calcularIMC() < 25) {
							System.out.println(p.getNome() + "\n");
						}
					}
					break;
				case 4:
					System.out.println("Opção de mostrar as pessoas que estão acima do peso selecionada!");
					for(Pessoa p : pessoas) {
						if(p.calcularIMC() >= 25) {
							System.out.println(p.getNome() + "\n");
						}
					}
					break;
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	
		
	}

}

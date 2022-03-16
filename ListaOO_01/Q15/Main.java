package ListaOO_01.Q15;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	private static void exibirMenu(){
	System.out.println("\n\n");
	System.out.println("+----------------------------------------------------+");
	System.out.println("|             Menu de Opções                         |");
	System.out.println("+----------------------------------------------------+");
	System.out.println("1 - Cadastrar Livraria                                ");
	System.out.println("2 - Cadastrar Funcionário em uma livraria 		      ");
	System.out.println("3 - Definir Gerente de uma livraria	                  ");
	System.out.println("4 - Adicionar livros em uma livrario                  ");
	System.out.println("5 - Listar os livros de uma livraria                  ");
	System.out.println("6 - Listar os funcionários de uma livraria            ");
	System.out.println("7 - Listar os gerentes das livrarias cadastradas      ");
	System.out.println("0 - Sair  				                              ");
	System.out.println("+----------------------------------------------------+");
}
	
	private static Livraria cadastrarLivraria() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome da livraria: ");
		String nome = sc.next();
		
		System.out.print("Informe a cidade da livraria: ");
		String cidade = sc.next();
		
		System.out.println("Informe o estado da livraria: ");
		String estado = sc.next();
		
		Livraria livraria = new Livraria(nome, cidade, estado);
		System.out.println("Livraria cadastrada com sucesso!");
		return livraria;
	}
	
	private static Funcionario cadastrarFuncionario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o CPF do funcionário: ");
		String cpf = sc.next();
		
		System.out.print("Informe o nome do funcionário: ");
		String nome = sc.next();
		
		System.out.print("Informe o endereço do funcionário: ");
		String endereco = sc.next();
		
		System.out.println("Informe o telefone do funcionário: ");
		String telefone = sc.next();
		
		Funcionario funcionario = new Funcionario(nome, endereco, telefone, cpf);
		return funcionario;
	}
	
	private static Livro cadastrarLivro() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o autor do livro: ");
		String autor = sc.next();
		
		System.out.print("Informe o ISBN do livro: ");
		int isbn = sc.nextInt();
		
		System.out.print("Informe a editora do livro: ");
		String editora = sc.next();
		
		System.out.println("Informe o titulo do livro: ");
		String titulo = sc.next();
		
		System.out.println("Informe o ano de edição do livro: ");
		int anoEdicao = sc.nextInt();
		
		Livro livro = new Livro(autor, isbn, editora, titulo, anoEdicao);
		return livro;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livraria> livrarias = new ArrayList<Livraria>();
		Livraria livraria = new Livraria();
		Livraria l;
		Livro livro;
		String nome, cpf;
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar uma livraria selecionada!");
					cadastrarLivraria();							
					break;
				case 2:
					System.out.println("Opção de cadastrar funcionário em uma livraria selecionada!");
					System.out.print("Digite o nome da livraria que deseja cadastrar o funcionário: ");
					nome = sc.next();
					l = livraria.buscarLivraria(livrarias, nome);
					if(!Objects.isNull(l)) {
						Funcionario f = cadastrarFuncionario();
						l.setFuncionarios(f);
						System.out.println("Funcionário cadastrado com sucesso!");
					}
					else {
						System.out.println("Algo de errado aconteceu");
					}
										
					break;	
				case 3: 
					System.out.println("Opção de definir gerente de uma livraria selecionada!");
					System.out.print("Informe o nome da livraria que deseja definir o gerente: ");
					nome = sc.next();
					l = livraria.buscarLivraria(livrarias, nome);
					if(!Objects.isNull(l)) {
						System.out.print("Digite o cpf do funcionário que deseja definir como gerente: ");
						cpf = sc.next();
						Funcionario f = livraria.buscarFuncionario(l, cpf);
						l.setGerente(f);
					}
					break;
				case 4: 
					System.out.println("Opção de adicionar livros em uma livraria selecionada!");
					System.out.print("Informe o nome da livraria que deseja definir o gerente: ");
					nome = sc.next();
					l = livraria.buscarLivraria(livrarias, nome);
					livro = cadastrarLivro();
					l.setLivros(livro);
					break;
				case 5: 
					System.out.println("Opção de listar os livros de uma livraria selecionada!");
					System.out.print("Informe o nome da livraria que deseja definir o gerente: ");
					nome = sc.next();
					livraria.LivroLivraria(livrarias, nome);					
				case 6: 
					System.out.println("Opção de listar os funcionários de uma livraria selecionada!");
					System.out.print("Informe o nome da livraria que deseja definir o gerente: ");
					nome = sc.next();
					livraria.FuncionarioLivraria(livrarias, nome);
					break;
				case 7:
					System.out.println("Opção de listar os gerentes das livrarias selecionada!");
					livraria.GerenteLivraria(livrarias);
					break;
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	

	}

}

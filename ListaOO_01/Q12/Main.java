package ListaOO_01.Q12;

import java.util.ArrayList;
import java.util.Scanner;

import ListaOO_01.Q11.Conta;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Op��es                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Livro                                   ");
		System.out.println("2 - Buscar livro por t�tulo       					  ");
		System.out.println("3 - Listar livros por autor                           ");
		System.out.println("4 - Listar todos os livros                            ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Livro cadastrarLivro() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do Autor do livro: ");
		String nomeAutor = sc.nextLine();		
		System.out.print("Informe o CPF do Autor do livro: ");
		String cpf = sc.nextLine();		
		System.out.print("Informe o endere�o do Autor do livro: ");
		String enderecoAutor = sc.nextLine();		
		System.out.print("Informe o nome da Editora do livro: ");
		String nomeEditora = sc.nextLine();		
		System.out.print("Informe o CNPJ do Autor do livro: ");
		String cnpj = sc.nextLine();		
		System.out.print("Informe o endere�o da Editora do livro: ");
		String enderecoEditora = sc.nextLine();		
		System.out.print("Informe o telefone da Editora do livro: ");
		String telefone = sc.nextLine();				
		System.out.print("Informe o ISBN do livro: ");
		int isbn = sc.nextInt();		
		sc.nextLine();
		System.out.print("Informe o t�tulo do livro: ");
		String titulo = sc.nextLine();		
		System.out.print("Informe o ano da edi��o do livro: ");
		int anoEdicao = sc.nextInt();
		
		Autor autor = new Autor(nomeAutor, cpf, enderecoAutor);
		Editora editora = new Editora(cnpj, nomeEditora, enderecoEditora, telefone);
		Livro livro = new Livro(autor, editora, isbn, titulo, anoEdicao);
		
		System.out.println("Livro cadastrado com sucesso!");
		
		return livro;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		Livro livro = new Livro();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Op��o escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Op��o de cadastrar um livro selecionada!");
					livro = cadastrarLivro();
					livros.add(livro);			
					break;
				case 2:
					System.out.println("Op��o de buscar livro por t�tulo selecionada!");
					System.out.print("Informe o t�tulo do livro: ");	
					String titulo = sc.next();
					sc.nextLine();
					livro.buscarLivro(livros, titulo);
					break;	
				case 3: 
					System.out.println("Op��o de listar livros por autor selecionada!");
					System.out.print("Informe o nome do autor: ");		
					String autor = sc.next();
					sc.nextLine();
					livro.livrosAutor(livros, autor);
					break;
				case 4: 
					System.out.println("Op��o de listar todos os livros selecionada!");
					System.out.println(livros);
					break;
				
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 

	}

}

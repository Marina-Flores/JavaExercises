package ListaOO_01.Q09;

import java.util.ArrayList;
import java.util.Scanner;

import ListaOO_01.Q07.Funcionario;

public class Main {

	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Livro                                   ");
		System.out.println("2 - Buscar Livro por Título							  ");
		System.out.println("3 - Listar livros por autor                           ");
		System.out.println("4 - Listar todos os livros                            ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Livro cadastrarLivro() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o autor do livro: ");
		String autor = sc.nextLine();
		
		System.out.print("Informe a editora do livro: ");
		String editora = sc.nextLine();
		
		System.out.print("Informe o título do livro: ");
		String titulo = sc.nextLine();
		
		System.out.print("Informe o ISBN do livro: ");
		int isbn = sc.nextInt();
		
		System.out.print("Informe o ano de edição do livro: ");
		int anoEdicao = sc.nextInt();
		
		Livro livro = new Livro(autor, editora, isbn, titulo, anoEdicao);
		
		return livro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		Livro livro = new Livro();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar um funcionário selecionada!");
					livro = cadastrarLivro();
					livros.add(livro);			
					break;
				case 2:
					System.out.println("Opção de buscar livro por título selecionada!");
					System.out.println("Informe o título do livro: ");
					String titulo = sc.next();
					
					livro.getProduto(livros, titulo);
					break;	
				case 3: 
					System.out.println("Opção de listar livros por autor selecionada!");
					System.out.println("Informe o autor do livro: ");
					String autor = sc.next();
					
					livro.getProdutoAutor(livros, autor);
					break;
				case 4: 
					System.out.println("Opção de listar todos os livros selecionada!");
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

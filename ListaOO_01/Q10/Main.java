package ListaOO_01.Q10;

import java.util.Scanner;

import ListaOO_01.Q09.Livro;

import java.util.ArrayList;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Produto                                 ");
		System.out.println("2 - Buscar Produto       							  ");
		System.out.println("3 - Listar todos os produtos                          ");
		System.out.println("4 - Efetuar venda de produto                          ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Produto cadastrarProduto() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o código do produto: ");
		String codigo = sc.nextLine();
		
		System.out.print("Informe o preço do produto: ");
		double preco = sc.nextDouble();
		
		System.out.print("Informe a quantidade do produto: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, codigo, preco, quantidade);
		
		return produto;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto();
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar um produto selecionada!");
					produto = cadastrarProduto();
					produtos.add(produto);			
					break;
				case 2:
					System.out.println("Opção de buscar produto por nome selecionada!");
					System.out.print("Informe o nome do produto: ");
					String nome = sc.next();					
					produto.buscarProduto(produtos, nome);
					break;	
				case 3: 
					System.out.println("Opção de listar todos os produtos selecionada!");
					System.out.println(produtos);
					break;
				case 4: 
					System.out.println("Opção de vender um produto selecionada!");
					System.out.print("Informe o nome do produto que deseja fazer a venda: ");
					String n = sc.next();					
					produto.venderProduto(produtos, n);					
					break;
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	

	}

}

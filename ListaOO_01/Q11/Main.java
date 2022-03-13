package ListaOO_01.Q11;

import java.util.ArrayList;
import java.util.Scanner;

import ListaOO_01.Q10.Produto;


public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Conta                                   ");
		System.out.println("2 - Realizar depósito       						  ");
		System.out.println("3 - Realizar saque                                    ");
		System.out.println("4 - Verificar saldo                                   ");
		System.out.println("5 - Consultar cliente                                 ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	private static Conta cadastrarConta() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Informe a agência da conta: ");
		int agencia = sc.nextInt();
		
		System.out.print("Informe o saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Informe o nome do cliente: ");
		String nome = sc.next();
		
		System.out.print("Informe o CPF do cliente: ");
		String cpf = sc.next();
		
		Cliente cliente = new Cliente(nome, cpf);
		Conta conta = new Conta(numero, agencia, cliente, saldo);
		return conta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta conta = new Conta();
		String nome;
		double valor;
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar uma conta selecionada!");
					conta = cadastrarConta();
					contas.add(conta);			
					break;
				case 2:
					System.out.println("Opção de realizar depósito selecionada!");
					System.out.print("Informe o nome do cliente: ");
					nome = sc.next();			
					System.out.print("Informe o valor do depósito: ");
					valor = sc.nextDouble();
					conta.Depositar(contas, nome, valor);
					break;	
				case 3: 
					System.out.println("Opção de realizar saque selecionada!");
					System.out.print("Informe o nome do cliente: ");
					nome = sc.next();		
					System.out.print("Informe o valor do saque: ");
					valor = sc.nextDouble();
					conta.Sacar(contas, nome, valor);
					break;
				case 4: 
					System.out.println("Opção de verificar saldo selecionada!");
					System.out.print("Informe o nome do cliente: ");
					nome = sc.next();			
					conta.VerificarSaldo(contas, nome);
					break;
				case 5: 
					System.out.println("Opção de consultar cliente selecionada!");
					System.out.print("Digite o número da conta do cliente: ");
					int numero = sc.nextInt();
					conta.ConsultarCliente(contas, numero);
					break;
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	

	}

}

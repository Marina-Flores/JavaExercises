package ListaOO_01.Q13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Cadastrar Conta                                   ");
		System.out.println("2 - Realizar depósito       					      ");
		System.out.println("3 - Realizar saque                                    ");
		System.out.println("4 - Verificar saldo                                   ");
		System.out.println("5 - Consultar número e nome da agência                ");
		System.out.println("6 - Alterar o número e nome da agência                ");
		System.out.println("0 - Sair  				                              ");
		System.out.println("+----------------------------------------------------+");
	}
	
	private static Conta cadastrarConta() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do Cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Informe o CPF do Cliente: ");
		String cpf = sc.nextLine();
		
		System.out.print("Informe o nome da Agência: ");
		String nomeAgencia = sc.nextLine();
		
		System.out.print("Informe o Número da Agência: ");
		int numeroAgencia = sc.nextInt();
		
		System.out.print("Informe o Número da Conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o Saldo da Conta: ");
		double saldo = sc.nextDouble();
		
		Cliente cliente = new Cliente(nomeCliente, cpf);
		Banco banco = new Banco(nomeAgencia, numeroAgencia);
		Conta conta = new Conta(numeroConta, banco, cliente, saldo);
		
		System.out.println("Conta cadastrada com sucesso!");
		return conta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta conta = new Conta();
		String cpf;
		double valor;
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de cadastrar uma Conta selecionada!");
					if(contas.size() < 10) {
						conta = cadastrarConta();
						contas.add(conta);	
					}
					else {
						System.out.println("Limete total de contas atingido!");
					}						
					break;
				case 2:
					System.out.println("Opção de realizar depósito selecionada!");
					System.out.print("Informe o CPF da conta: ");
					cpf = sc.next();					
					System.out.println("Informe o valor que deseja depositar");
					valor = sc.nextDouble();
					conta.Depositar(contas, cpf, valor);
					break;	
				case 3: 
					System.out.println("Opção de realizar saque selecionada!");
					System.out.print("Informe o CPF da conta: ");
					cpf = sc.next();					
					System.out.println("Informe o valor que deseja depositar");
					valor = sc.nextDouble();
					conta.Sacar(contas, cpf, valor);
					break;	
				case 4: 
					System.out.println("Opção de verificar saldo selecionada!");
					System.out.print("Informe o CPF da conta: ");
					cpf = sc.next();	
					conta.VerificarSaldo(contas, cpf);
					break;
				case 5: 
					System.out.println("Opção de consultar número e nome da agência selecionada!");
					System.out.print("Informe o CPF da conta: ");
					cpf = sc.next();	
					conta.ConsultarConta(contas, cpf);
					break;
				case 6:
					conta.AlterarBanco(contas);
					break;				
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 

	}

}

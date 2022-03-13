package ListaOO_01.Q13;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
	private int Numero;
	private Banco Banco;
	private Cliente Cliente;
	private double Saldo;
	
	public Conta() { }
	
	public Conta(int numero, Banco banco, Cliente cliente, double saldo) {
		this.Numero = numero;
		this.Banco = banco;
		this.Cliente = cliente;
		this.Saldo = saldo;
	}

	
	public int getNumero() {
		return Numero;
	}

	
	public void setNumero(int numero) {
		Numero = numero;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		if(saldo > 0) {
			Saldo = saldo;
		}
	}

	public void Depositar(ArrayList<Conta> contas, String cpf, double valor) {
		for(Conta c : contas) {
			if(c.Cliente.getCPF().equals(cpf)) {
				c.Saldo += valor;
			}
			else {
				System.out.println("Não há conta com o CPF: " + cpf);
			}
		}
	}

	public void Sacar(ArrayList<Conta> contas, String cpf, double valor) {
		for(Conta c : contas) {
			if(c.Cliente.getCPF().equals(cpf)) {
				if(c.Saldo >= valor) {
					c.Saldo -= valor;
				}
				else {
					System.out.println("Saldo insuficiente!");
				}
			}
			else {
				System.out.println("Nenhuma conta com o cpf" + cpf + " foi encontrada");
			}
		}
	}

	public void VerificarSaldo(ArrayList<Conta> contas, String cpf) {
		for(Conta c : contas) {
			if(c.Cliente.getCPF().equals(cpf)) {
				System.out.println("Saldo: " + c.Saldo);
			}
			else {
				System.out.println("Nenhuma conta com o cpf" + cpf + " foi encontrada");
			}
		}
	}

	public void ConsultarConta(ArrayList<Conta> contas, String cpf) {
		for(Conta c : contas) {
			if(c.Cliente.getCPF().equals(cpf)) {
				System.out.println(c.Banco + "\n" + c.Cliente);
			}
		}
	}

	public void AlterarBanco(ArrayList<Conta> contas) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente que deseja alterar os dados: ");
		String nome = sc.next();
		
		for(Conta conta : contas) {
			if(conta.Cliente.getNome().equals(nome)) {
				System.out.print("Informe o novo número da Agência: ");
				int numero = sc.nextInt();
				conta.Banco.setNumeroAgencia(numero);
				
				System.out.println("Informe o novo nome da Agência: ");
				String nomeAgencia = sc.next();
				conta.Banco.setNomeAgencia(nomeAgencia);
				
				System.out.println("Dados alterados com sucesso!");
			}
			else {
				System.out.println("Não foi encontrada nenhuma conta pertencente ao nome informado.");
			}
		}
	
	
	
	}
}

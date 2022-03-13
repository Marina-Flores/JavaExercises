package ListaOO_01.Q11;

import java.util.ArrayList;

public class Conta {
	private int Numero;
	private int Agencia;
	private Cliente Cliente;
	private double Saldo;
	
	public Conta(int numero, int agencia, Cliente cliente, double saldo) {
		this.Numero = numero;
		this.Agencia = agencia;
		this.Cliente = cliente; 
		this.Saldo = saldo; 
	}

	public Conta() {}
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public int getAgencia() {
		return Agencia;
	}

	public void setAgencia(int agencia) {
		Agencia = agencia;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		if(saldo > 0) {
			Saldo = saldo;	
		}		
	}
	
	public void Depositar(ArrayList<Conta> contas, String nome, double valor) {
		for(Conta c : contas) {
			if(c.Cliente.getNome().equals(nome)) {
				this.Saldo += valor;
				System.out.println("Depósito realizado com sucesso!");
			}
		}		
	}
	
	public void Sacar(ArrayList<Conta> contas, String nome, double valor) {
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void VerificarSaldo(ArrayList<Conta> contas, String nome) {
		for(Conta c : contas) {
			if(c.Cliente.getNome().equals(nome)) {
				System.out.println(c.Saldo); 
			}
		}		
	}
	
	public void ConsultarCliente(ArrayList<Conta> contas, int numero) {
		for(Conta c : contas) {
			if(c.Numero == numero) {
				System.out.println(c.Cliente);
			}
		}
	}
}

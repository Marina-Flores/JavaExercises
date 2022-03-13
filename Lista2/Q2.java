package Lista2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	float valor; 
	
	System.out.print("Digite um valor: ");
	float x = sc.nextFloat();
	
	float maior = x, menor = x, soma = x; 
	
	for(int i = 0; i < 9; i++) {
		System.out.print("Digite um valor: ");
		valor = sc.nextFloat();
		soma += valor; 
		
		if(valor > maior) {
			maior = valor;
		}
		else if(valor < menor) {
			menor = valor; 
		}
		
	}
		
	System.out.println("O maior valor digitado foi " + maior);
	System.out.println("O menor valor digitado foi " + menor);
	System.out.println("A média dos valores digitado é de " + (soma / 10));
		
	}

}

package Lista;

import java.util.Scanner;

public class Questao_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);			
		int anoAtual = 2022;
		int anoNascimento;
		System.out.print("Digite o ano que você nasceu: ");
		anoNascimento = sc.nextInt();		
		int idade = (anoAtual - anoNascimento); 
		System.out.println("Esse ano você tem / terá: " + idade);
	}

}

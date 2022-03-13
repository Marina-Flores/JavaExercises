package Lista;

import java.util.Scanner;

public class Questao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade, soma, i=1;
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		soma = idade;
		
		while(idade != 0) {
			System.out.print("Digite a sua idade: ");
			idade = sc.nextInt();
			i++;
			soma += idade;
		}
		
		double media = soma / i;
		System.out.println("A média das idades é de " + media);
		

	}

}

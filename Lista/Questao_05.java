package Lista;

import java.util.Scanner;

public class Questao_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b;
		String escolha;
		System.out.print("Digite o primeiro número: ");
		a = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		b = sc.nextDouble();
		
		System.out.println("Digite a operação que você deseja realizar com os números: \n + para somar \n - para subtrair \n * para multiplcar \n / para dividir");
		escolha = sc.next();
		
		
		
		if(escolha == "+") {
			System.out.print("A soma " + a + " + " + b + "é igual a " + (a + b));
		}
		else if(escolha == "-") {
			System.out.print("A subtração " + a + " - " + b + "é igual a " + (a - b));
		}
		else if(escolha == "*") {
			System.out.print("A multiplicação " + a + " * " + b + "é igual a " + (a * b));
		}
		else if(escolha == "/") {
			System.out.print("A divisão " + a + " / " + b + "é igual a " + (a / b));
		}
	}

}

package Lista;

import java.util.Scanner;

public class Questao_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b;
		String escolha;
		System.out.print("Digite o primeiro n�mero: ");
		a = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		b = sc.nextDouble();
		
		System.out.println("Digite a opera��o que voc� deseja realizar com os n�meros: \n + para somar \n - para subtrair \n * para multiplcar \n / para dividir");
		escolha = sc.next();
		
		
		
		if(escolha == "+") {
			System.out.print("A soma " + a + " + " + b + "� igual a " + (a + b));
		}
		else if(escolha == "-") {
			System.out.print("A subtra��o " + a + " - " + b + "� igual a " + (a - b));
		}
		else if(escolha == "*") {
			System.out.print("A multiplica��o " + a + " * " + b + "� igual a " + (a * b));
		}
		else if(escolha == "/") {
			System.out.print("A divis�o " + a + " / " + b + "� igual a " + (a / b));
		}
	}

}

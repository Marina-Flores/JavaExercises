package Lista;
import java.util.Scanner;

public class Questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		double primeiraAltura, segundaAltura, terceiraAltura, quartaAltura, quintaAltura;
		System.out.print("1� Altura: ");
		primeiraAltura = sc.nextDouble();
		System.out.print("2� Altura: ");
		segundaAltura = sc.nextDouble();
		System.out.print("3� Altura: ");
		terceiraAltura = sc.nextDouble();
		System.out.print("4� Altura: ");
		quartaAltura = sc.nextDouble();
		System.out.print("5� Altura: ");
		quintaAltura = sc.nextDouble();

		double media = (primeiraAltura + segundaAltura + terceiraAltura + quartaAltura + quintaAltura) / 5;
		
		System.out.println("A m�dia das alturas � de " + media);
		
	}
}

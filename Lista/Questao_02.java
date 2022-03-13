package Lista;
import java.util.Scanner;

public class Questao_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		double primeiraAltura, segundaAltura, terceiraAltura, quartaAltura, quintaAltura;
		System.out.print("1ª Altura: ");
		primeiraAltura = sc.nextDouble();
		System.out.print("2ª Altura: ");
		segundaAltura = sc.nextDouble();
		System.out.print("3ª Altura: ");
		terceiraAltura = sc.nextDouble();
		System.out.print("4ª Altura: ");
		quartaAltura = sc.nextDouble();
		System.out.print("5ª Altura: ");
		quintaAltura = sc.nextDouble();

		double media = (primeiraAltura + segundaAltura + terceiraAltura + quartaAltura + quintaAltura) / 5;
		
		System.out.println("A média das alturas é de " + media);
		
	}
}

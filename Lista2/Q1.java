package Lista2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float soma = 0; 
		float numeros[] = new float[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextFloat();
			
			soma += numeros[i];
		}
		
		System.out.println("A soma dos números digitados é de " + soma);
	}

}

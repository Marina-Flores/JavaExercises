package Lista2;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	float numeros[] = new float[10];
	
	for(int i = 0; i < numeros.length; i++) {
		System.out.print("Digite o " + i + "º número: ");
		numeros[i] = sc.nextFloat();
	}
	
	for(int i = numeros.length - 1; i >= 0; i--) {
		System.out.print(numeros[i] + "; ");		
	}
	
	
	
	}
}

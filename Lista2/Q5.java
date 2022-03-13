package Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos nomes você deseja cadastrar? ");
		int quantidade = sc.nextInt();
		
		String nomes[] = new String[quantidade];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i+1) + "º nome: ");
			nomes[i] = sc.next();
		}
		
		System.out.print("Digite o nome que você quer encontrar na lista: ");
		String nome = sc.next();
		
		boolean verifica = Arrays.stream(nomes).anyMatch(s -> s.equals(nome));
		
		if(verifica) {
			System.out.println("O nome está incluido na lista!");
		}
		else {
			System.out.println("O nome não está incluido na lista");
		}	
	
	}

}

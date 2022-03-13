package Lista2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[10];
		
		float soma = 0;
		int aprovados = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno: ");
			notas[i] = sc.nextFloat();
			
			soma += notas[i];
			
			if(notas[i] >= 7) {
				aprovados++;
			}
		}
		
		System.out.println("A média da turma é de " + (soma / 10));
		System.out.println("O total de alunos aprovados foi de " + aprovados);
	}

}

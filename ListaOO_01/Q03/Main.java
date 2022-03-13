package ListaOO_01.Q03;

import java.util.Scanner;

public class Main {
	
	private void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Opções                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Criar Retângulo                  		|");
		System.out.println("| 2 - Calcular Área	                  		|");
		System.out.println("| 3 - Calcular Perímetro		        	|");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}		
	private void criarCirculo(Circulo circulo) {
		  Scanner sc = new Scanner(System.in);		
		  System.out.println("Informe o valor do raio do círculo");
		  double raio = sc.nextDouble();
		  circulo.setRaio(raio);
		  System.out.println("Retângulo criado com sucesso!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main teste = new Main();
		Circulo circulo = new Circulo();
	short opcao = 50;		
		do{
			teste.exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					teste.criarCirculo(circulo);
					break;
				case 2:
					System.out.println("Opção de calcular área do círculo selecionada!");
					System.out.println(circulo.calcularArea());					
					break;
				case 3:
					System.out.println("Opção de calcular perímetro do círculo selecionada!");
					System.out.println(circulo.calcularPerimetro());					
					break;							
				case 50:
					teste.exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 		
	}

}

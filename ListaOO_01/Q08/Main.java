package ListaOO_01.Q08;

import java.util.Scanner;

public class Main {
	private static void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|             Menu de Opções                         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("1 - Andar                                 			  ");
		System.out.println("2 - Reabastecer							  		      ");
		System.out.println("3 - Verificar a quantidade de combustível restante    ");
		System.out.println("0 - Encerrar viagem   				                  ");
		System.out.println("+----------------------------------------------------+");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a eficiência do carro");
		double eficiencia = sc.nextDouble();
		
		System.out.println("Informe a quantidade que você deseja abastecer");
		double combustivel = sc.nextDouble();
		
		Carro carro = new Carro(eficiencia, combustivel);
		
		short opcao = 50;		
		do{
			exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					System.out.println("Opção de andar selecionada!");
					System.out.print("Informe a quantidade de KM que deseja andar: ");
					double km = sc.nextDouble();
					carro.Andar(km);
					break;
				case 2:
					System.out.println("Opção de reabastecer selecionada!");
					System.out.println("Informe a quantidade que você deseja abastecer");
					double litros = sc.nextDouble();
					carro.Reabastecer(litros);
					break;	
				case 3:
					System.out.println("Combustível disponível: " + carro.getCombustivel());					
					break;	
				case 50:
					exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 	

	}

}

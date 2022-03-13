package ListaOO_01.Q02;

import java.util.Scanner;

public class main {
	
	private void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Op��es                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Criar Ret�ngulo                  		|");
		System.out.println("| 2 - Calcular �rea	                  		|");
		System.out.println("| 3 - Calcular Per�metro		        	|");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}		
	
	private void criarRetangulo(Retangulo retangulo) {
		  Scanner sc = new Scanner(System.in);		
		  System.out.println("Informe o valor da altura do ret�ngulo");
		  double altura = sc.nextDouble();
		  retangulo.setAltura(altura);
		  
		  System.out.println("Informe o valor da base do ret�ngulo ");
		  double base = sc.nextDouble();
		  retangulo.setBase(base);
		  
		  System.out.println("Ret�ngulo criado com sucesso!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		main teste = new main();
		Retangulo retangulo = new Retangulo();
	short opcao = 50;		
		do{
			teste.exibirMenu();
			System.out.print("Op��o escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					teste.criarRetangulo(retangulo);
					break;
				case 2:
					System.out.println("Op��o de calcular �rea do ret�ngulo selecionada!");
					System.out.println(retangulo.calcularArea());					
					break;
				case 3:
					System.out.println("Op��o de calcular per�metro do ret�ngulo selecionada!");
					System.out.println(retangulo.obterPerimetro());					
					break;							
				case 50:
					teste.exibirMenu();
					break;
				default:
			}
		}while(opcao != 0); 		

	}

}

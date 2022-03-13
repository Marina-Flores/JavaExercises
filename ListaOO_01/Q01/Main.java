package ListaOO_01.Q01;

import java.util.Scanner;

public class Main {
	private void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|             Menu de Opções                |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 1 - Cadastrar Estudante                   |");
		System.out.println("| 2 - Calcular Média	                    |");
		System.out.println("| 3 - Obter número de matricula		        |");
		System.out.println("| 4 - Obter Endereço				        |");
		System.out.println("| 0 - Sair					                |");
		System.out.println("+-------------------------------------------+");
	}		
	
	  public void cadastraEstudante(Estudante estudante) { 
		  Scanner sc = new Scanner(System.in);		  
		  double notas[] = new double[4];
		  
		  System.out.println("Informe o nome do estudante: "); 
		  String nome = sc.nextLine();
		  estudante.setNome(nome);
	  
		  System.out.println("Informe a matrícula do estudante: "); 
		  String matricula = sc.nextLine(); 
		  estudante.setMatricula(matricula);
	  
		  System.out.println("Informe o endereço do estudante: "); 		 
		  String endereco = sc.nextLine(); 
		  estudante.setEndereco(endereco);
			
		   for(int i = 0; i < 4; i++) { 
		   System.out.println("Digite a " + (i+1) +"ª nota do estudante: "); 		   
		   notas[i] = sc.nextDouble(); 
		   }
		   estudante.setNotas(notas);
		  
	      System.out.println("Estudante cadastrado!"); 	  
	  }

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main teste = new Main();
		Estudante estudante = new Estudante();
	short opcao = 50;		
		do{
			teste.exibirMenu();
			System.out.print("Opção escolhida: ");
			opcao = sc.nextShort();
			
			switch(opcao){
				case 1:
					teste.cadastraEstudante(estudante);
					break;
				case 2:
					System.out.println("Opção de calcular média selecionada!");
					System.out.println(estudante.calculaMedia());			
					break;
				case 3:
					System.out.println("Opção de obter matrícula selecionada!");
					System.out.println(estudante.getMatricula());					
					break;
				case 4:
					System.out.println("Opção de obter endereço selecionada!");
					System.out.println(estudante.getEndereco());					
					break;				
				case 50:
					teste.exibirMenu();
					break;
				default:					
			}
		}while(opcao != 0); 
	}	

}

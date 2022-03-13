package ListaOO_01.Q01;

public class Estudante {
	
	public Estudante(String nome, String matricula, String endereco, double[] notas) {
		this.Nome = nome;
		this.Matricula = matricula;
		this.Endereco = endereco;
		this.Notas = notas;
	}
	
	public Estudante() {		
	}
	
	private String Nome;
	private String Matricula;
	private String Endereco;
	private double[] Notas = new double[4];

	
	public String getNome() {
	   return Nome;
	}

	public void setNome(String nome) {
	   this.Nome = nome;
	}	
	
	
	  public double[] getNotas() { return Notas; }
	  
	  public void setNotas(double[] notas) { this.Notas = notas; }
	  
	  public String getEndereco() { return Endereco; }
	  
	  public void setEndereco(String endereco) { this.Endereco = endereco; }
	 
	
	public String getMatricula() {
		return Matricula;
	}
	
	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}	
	
	
	  public double calculaMedia() { 
	   double soma = 0;
	  
	   for(int i = 0; i < this.Notas.length; i++) { soma += this.Notas[i]; }
	  
	   double media = soma / this.Notas.length;
	  
	   return media; 
	  }
	
	    @Override
	    public String toString() {
	        return "\n Nome: " + this.Nome + " - Matricula: " + this.Matricula + " - Média: " + calculaMedia() + "";
	    }
	    
	 
	
}

package ListaOO_01.Q15;

import java.util.ArrayList;

public class Livraria {
	private String Nome;
	private String Cidade;
	private String Estado;
	private Funcionario Gerente;
	private ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Livro> Livros = new ArrayList<Livro>();
	
	public Livraria(String nome, String cidade, String estado) {
		this.Nome = nome;
		this.Cidade = cidade;
		this.Estado = estado;		
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Funcionario getGerente() {
		return Gerente;
	}

	public void setGerente(Funcionario gerente) {
		Gerente = gerente;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(Funcionario funcionario) {
		Funcionarios.add(funcionario);
	}

	public ArrayList<Livro> getLivros() {
		return Livros;
	}

	public void setLivros(Livro livro) {
		Livros.add(livro);
	}

	public Livraria() {}
	
	public Livraria buscarLivraria(ArrayList<Livraria> livrarias, String nome) {
		for(Livraria l : livrarias) {
			if(l.Nome.equals(nome)) {
				return l;
			}
			else {
				System.out.println("Não foi encontrada nenhuma livraria com esse nome!");
			}	
		}
		return new Livraria();
	}
	
	public Funcionario buscarFuncionario(Livraria l, String cpf) {
		for(Funcionario f : l.Funcionarios) {
			if(f.getCPF().equals(cpf)) {
				return f;
			}
			else {
				System.out.println("Nenhum funcionário com esse cpf cadastrado na livraria informada");
			}
		}
		return new Funcionario();
	}
	
	public void LivroLivraria(ArrayList<Livraria> livrarias, String nome) { 
		for(Livraria l : livrarias) {
			if(l.Nome.equals(nome)) {
				for(Livro livro : l.Livros) {
					System.out.println(livro);
				}
			}
		}
	}
	
	public void FuncionarioLivraria(ArrayList<Livraria> livrarias, String nome) { 
		for(Livraria l : livrarias) {
			if(l.Nome.equals(nome)) {
				for(Funcionario f : l.Funcionarios) {
					System.out.println(f);
				}
			}
		}
	}
	
	public void GerenteLivraria(ArrayList<Livraria> livrarias) {
		for(Livraria l : livrarias) {
			System.out.println(l.Gerente);
		}
	}
}

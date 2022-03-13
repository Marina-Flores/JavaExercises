package ListaOO_01.Q12;

import java.util.ArrayList;

public class Livro {
	private Autor Autor;
	private Editora Editora;
	private int ISBN;
	private String Titulo;
	private int AnoEdicao;

	public Livro(Autor autor, Editora editora, int iSBN, String titulo, int anoEdicao) {
		Autor = autor;
		Editora = editora;
		ISBN = iSBN;
		Titulo = titulo;
		AnoEdicao = anoEdicao;
	}
	
	public Livro() {}

	public Autor getAutor() {
		return Autor;
	}

	public void setAutor(Autor autor) {
		Autor = autor;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public void buscarLivro(ArrayList<Livro> livros, String titulo) {
		for(int i = 0; i < livros.size(); i++) {
			Livro l = livros.get(i);
			
			if(l.Titulo.equals(titulo)) {
				System.out.println(l);
			}
		}		
	}
	
	public void livrosAutor(ArrayList<Livro> livros, String nomeAutor) {
		for(Livro l : livros) {
			if(l.Autor.getNome().equals(nomeAutor)) {
				System.out.println(l);
			}
			else {
				System.out.println("Não há registros de livros desse autor!");
			}
		}
	}
	
	@Override
	public String toString() {
		return "\n -------------------------- \n "
				+ "Título: " + this.Titulo + 
				"\n Autor: " + this.Autor.getNome() +
				"\n Editora: " + this.Editora.getNome() +
				"\n Ano de Edição: " + this.AnoEdicao +
				"\n";
	}

}

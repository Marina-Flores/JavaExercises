package ListaOO_01.Q09;

import java.util.ArrayList;

public class Livro {
	private String Autor;
	private String Editora;
	private int ISBN;
	private String Titulo;
	private int AnoEdicao;
	
	public Livro(String autor, String editora, int isbn, String titulo, int anoEdicao) {
		this.Autor = autor; 
		this.Editora = editora;
		this.ISBN = isbn;
		this.Titulo = titulo;
		this.AnoEdicao = anoEdicao;
	}
	
	public Livro() {}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getAnoEdicao() {
		return AnoEdicao;
	}

	public void setAnoEdicao(int anoEdicao) {
		AnoEdicao = anoEdicao;
	}
	
	public void getProduto(ArrayList<Livro> livros, String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				System.out.println(livro);
			}
		}
	}
	
	public void getProdutoAutor(ArrayList<Livro> livros, String autor) {
		for(Livro livro : livros) {
			if(livro.getAutor().equals(autor)) {
				System.out.println(livro);
			}
		}
	}
	
	@Override
	public String toString() {
		return " Título: " + this.Titulo + 
			"\n Autor(a): " + this.Autor +
			"\n Editora: " + this.Editora +
			"\n Ano de Edição: " + this.AnoEdicao + 
			"\n ISBN: " + this.ISBN;
	}
	
	
	
	
}

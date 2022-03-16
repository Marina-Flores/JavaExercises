package ListaOO_01.Q15;

public class Livro {
	private String Autor; 
	private int ISBN;
	private String Editora;
	private String Titulo;
	private int AnoEdicao;
	
	public Livro(String autor, int isbn, String editora, String titulo, int anoEdicao) {
		this.Autor = autor; 
		this.ISBN = isbn;
		this.Editora = editora;
		this.Titulo = titulo;
		this.AnoEdicao = anoEdicao;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
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
	
	
}

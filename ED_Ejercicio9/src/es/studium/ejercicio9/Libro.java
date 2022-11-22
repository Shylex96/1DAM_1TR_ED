package es.studium.ejercicio9;

public class Libro {
	private String titulo;
	private Autor autor; // Al poner Autor en vez de String hacemos referencia a la clase Autor,
							// importándola a nuestro autor en esta clase de Libro como si fuera un FK
	private int ano;
	private String editorial;
	private int numpaginas;

	public Libro() {
		titulo = "";
		autor = new Autor();
		ano = 0;
		editorial = "";
		numpaginas = 0;
	}

	public Libro(String titulo, Autor autor, int ano, String editorial, int numpaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

}

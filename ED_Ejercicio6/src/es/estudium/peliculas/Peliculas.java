package es.estudium.peliculas;

public class Peliculas {
	
	// Atributos
	
	private String titulo;
	private int a�o;
	private String duracion;
	
	// Constructor vac�o
	
	public Peliculas () 
	{
		titulo = "";
		a�o = 0;
		duracion = "";
	}
	
	// Constructor por par�metros
	
	public Peliculas (String title, int age, String duration) 
	{
		titulo = title;
		a�o = age;
		duracion = duration;
	}

	
	// M�todos inspectores
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
			
	
	
}

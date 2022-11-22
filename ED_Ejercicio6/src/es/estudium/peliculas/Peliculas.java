package es.estudium.peliculas;

public class Peliculas {
	
	// Atributos
	
	private String titulo;
	private int año;
	private String duracion;
	
	// Constructor vacío
	
	public Peliculas () 
	{
		titulo = "";
		año = 0;
		duracion = "";
	}
	
	// Constructor por parámetros
	
	public Peliculas (String title, int age, String duration) 
	{
		titulo = title;
		año = age;
		duracion = duration;
	}

	
	// Métodos inspectores
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
			
	
	
}

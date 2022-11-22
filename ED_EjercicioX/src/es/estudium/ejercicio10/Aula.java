package es.estudium.ejercicio10;

public class Aula {

	private String nombre;
	private int numeroAlumnos;
	
	public Aula() 
	{
		nombre = "";
		numeroAlumnos = 0;
	}

	public Aula(String nombre, int numeroAlumnos) {
		this.nombre = nombre;
		this.numeroAlumnos = numeroAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}
	
	
	
	
	
}

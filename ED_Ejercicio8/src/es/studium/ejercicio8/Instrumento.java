package es.studium.ejercicio8;

public class Instrumento {
	
	// Atributos
	
	private String nombre;
	private char afinacion;
	
	// Constructor vacío
	
		public Instrumento () 
		{
			nombre = "";
			afinacion = ' ';
		}
		
	// Constructor por parámetros
		
	public Instrumento (String name, char afina) 
	{
		nombre = name;
		afinacion = afina;
	}

	
	// Métodos inspectores
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(char afinacion) {
		this.afinacion = afinacion;
	}
	
	
	
	
	
}
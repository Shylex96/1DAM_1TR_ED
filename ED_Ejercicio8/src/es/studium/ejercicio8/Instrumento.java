package es.studium.ejercicio8;

public class Instrumento {
	
	// Atributos
	
	private String nombre;
	private char afinacion;
	
	// Constructor vac�o
	
		public Instrumento () 
		{
			nombre = "";
			afinacion = ' ';
		}
		
	// Constructor por par�metros
		
	public Instrumento (String name, char afina) 
	{
		nombre = name;
		afinacion = afina;
	}

	
	// M�todos inspectores
	
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
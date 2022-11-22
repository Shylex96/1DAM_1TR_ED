package es.studium.ejercicio7;

public class Piloto {
	
	// Atributos
	
	private String nombre;
	private String nacionalidad;
	
	// Constructor vac�o
	
		public Piloto () 
		{
			nombre = "";
			nacionalidad = "";
		}
		
	// Constructor por par�metros
		
	public Piloto (String name, String nationality) 
	{
		nombre = name;
		nacionalidad = nationality;
	}
		
		
	// M�todos inspectores
		
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
	
	
	
}

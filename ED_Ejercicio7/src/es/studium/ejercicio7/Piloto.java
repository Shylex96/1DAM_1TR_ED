package es.studium.ejercicio7;

public class Piloto {
	
	// Atributos
	
	private String nombre;
	private String nacionalidad;
	
	// Constructor vacío
	
		public Piloto () 
		{
			nombre = "";
			nacionalidad = "";
		}
		
	// Constructor por parámetros
		
	public Piloto (String name, String nationality) 
	{
		nombre = name;
		nacionalidad = nationality;
	}
		
		
	// Métodos inspectores
		
	
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

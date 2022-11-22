package es.studium.ejercicio9;

public class Autor {
	private String nombre;
	private String apellidos;
	private String nacionalidad;

	public Autor() 
	{
		nombre = "";
		apellidos = "";
		nacionalidad = "";

	}

	public Autor(String nombre, String apellidos, String nacionalidad) 
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}

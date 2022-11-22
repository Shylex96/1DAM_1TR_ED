package es.studium.ejercicio12;

public class Cliente 
{
	private String nombre;
	private String dni;
	private String direccion;
	
	public Cliente ()
	{
		nombre = "";
		dni = "";
		direccion = "";
	}
	
	public Cliente (String nom, String nie, String calle)
	{
		nombre = nom;
		dni = nie;
		direccion = calle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}

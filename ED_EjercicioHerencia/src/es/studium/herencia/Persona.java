package es.studium.herencia;

public class Persona {
	private String nombre;
	private String apellidos;
	private String domicilio;
	private int telefono;
	private String dni;

	public Persona() {
		nombre = "";
		apellidos = "";
		domicilio = "";
		telefono = 0;
		dni = "";
	}

	public Persona(String nombre, String apellidos, String domicilio, int telefono, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.dni = dni;
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
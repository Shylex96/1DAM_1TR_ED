package es.ejercicio;
//Ejercicios básicos - Ejercicio 1 (Tipo POJO, Sin método main)

// Clase Persona (Que llamaré "Ejercicio1" en este caso por tema de entendimiento y orden) compuesta por los atributos nombre:

// VALORES
public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private int telefono;
	
	// CONSTRUCTOR VACÍO
	public Persona () {
		nombre = "";
		apellidos = "";
		dni = "";
		domicilio = "";
		telefono = 0 ;
	}
	// CONSTRUCTOR CON PARÁMETROS
	public Persona (String name, String lastname, String calle, String nie, int tlf) {
		nombre = name;
		apellidos = lastname;
		dni = nie;
		domicilio = calle;
		telefono = tlf;
		
	}
	
	// Métodos inspectores
	
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
	
	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
		
	}
}


	
	
	



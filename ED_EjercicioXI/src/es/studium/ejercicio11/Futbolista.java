package es.studium.ejercicio11;

public class Futbolista {
	private String nombre;
	private String apellido;
	private boolean esComunitario;
	private Equipo equipo;

	public Futbolista() {
		nombre = "";
		apellido = "";
		esComunitario = false;
		equipo = new Equipo();
	}

	public Futbolista(String nombre, String apellido, boolean esComunitario, Equipo equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.esComunitario = esComunitario;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean getEsComunitario() {
		return esComunitario;
	}

	public void setEsComunitario(boolean esComunitario) {
		this.esComunitario = esComunitario;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}

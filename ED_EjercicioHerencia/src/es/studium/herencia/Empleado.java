package es.studium.herencia;

public class Empleado extends Persona {
	private String puesto;

	public Empleado() {
		super();
		puesto = "";
	}

	public Empleado(String nombre, String apellidos, String domicilio, int telefono, String dni, String puesto) {
		super(nombre, apellidos, domicilio, telefono, dni);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}

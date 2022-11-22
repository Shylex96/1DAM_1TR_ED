package es.studium.herencia;

public class Consejero extends Empleado {
	private int numeroAcciones;

	public Consejero() {
		super();
		numeroAcciones = 0;
	}

	public Consejero(String nombre, String apellidos, String domicilio, int telefono, String dni, String puesto) {
		super(nombre, apellidos, domicilio, telefono, dni, puesto);
	}

	public int getNumeroAcciones() {
		return numeroAcciones;
	}

	public void setNumeroAcciones(int numeroAcciones) {
		this.numeroAcciones = numeroAcciones;
	}

}

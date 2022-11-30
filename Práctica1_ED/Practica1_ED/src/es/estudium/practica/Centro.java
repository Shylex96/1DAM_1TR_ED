package es.estudium.practica;

public class Centro {

	// Atributos declarados:

	private String nombre;
	private String direccion;
	private int codigoIdentificador;

	// Constructor vac�o:

	public Centro() {
		nombre = "";
		direccion = "";
		codigoIdentificador = 0;
	}

	// Constructor por par�metros:

	public Centro(String nombre, String direccion, int codigoIdentificador) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoIdentificador = codigoIdentificador;
	}

	// M�todos inspectores:

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

}

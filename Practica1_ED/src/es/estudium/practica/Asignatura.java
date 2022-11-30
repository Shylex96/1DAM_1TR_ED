package es.estudium.practica;

public class Asignatura {

	// Atributos declarados:

	private String nombre;
	private int numeroHorasImpartidas;
	private String codigoIdentificador;

	// Constructor vac�o:

	public Asignatura() {
		nombre = "";
		numeroHorasImpartidas = 0;
		codigoIdentificador = "";
	}

	// Constructor por par�metros:

	public Asignatura(String nombre, int numeroHorasImpartidas, String codigoIdentificador) {
		this.nombre = nombre;
		this.numeroHorasImpartidas = numeroHorasImpartidas;
		this.codigoIdentificador = codigoIdentificador;
	}

	// M�todos inspectores:

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroHorasImpartidas() {
		return numeroHorasImpartidas;
	}

	public void setNumeroHorasImpartidas(int numeroHorasImpartidas) {
		this.numeroHorasImpartidas = numeroHorasImpartidas;
	}

	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

}

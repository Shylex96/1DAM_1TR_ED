package es.estudium.practica;

public class Alumno {
	// Atributos declarados:

	private String nombre;
	private String direccion;
	private int numMatricula;
	private float notaAsignatura;
	private Centro centro;
	private Asignatura asignatura;

	// Constructor vacío:

	public Alumno() {
		nombre = "";
		direccion = "";
		numMatricula = 0;
		notaAsignatura = 0.0f;
		centro = new Centro();
		asignatura = new Asignatura();
	}

	// Constructor por parámetros diferente al resto (Sin usar this)

	public Alumno(String nom, String direc, int numMatri, float notaAsigna, Centro cent, Asignatura asigna) {
		nombre = nom;
		direccion = direc;
		numMatricula = numMatri;
		notaAsignatura = notaAsigna;
		centro = cent;
		asignatura = asigna;
	}
	
	// Métodos inspectores:

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

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public float getNotaAsignatura() {
		return notaAsignatura;
	}

	public void setNotaAsignatura(float notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

}

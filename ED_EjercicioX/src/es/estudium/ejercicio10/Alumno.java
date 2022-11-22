package es.estudium.ejercicio10;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;
	private Aula aula;

	{

		nombre = "";
		apellidos = "";
		edad = 0;
		haPagado = false;
		aula = new Aula();

	}

	public Alumno(String name, String apel, int ed, boolean pago, Aula au) {
		nombre = name;
		apellidos = apel;
		edad = ed;
		haPagado = pago;
		aula = au;

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	
}

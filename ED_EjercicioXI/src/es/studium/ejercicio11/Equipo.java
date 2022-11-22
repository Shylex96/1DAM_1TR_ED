package es.studium.ejercicio11;

public class Equipo {
	private String nombre;
	private int ano;
	private int numeroSocios;
	
	public Equipo ()
	{
		nombre = "";
		ano = 0;
		numeroSocios = 0;
	}

	public Equipo(String nombre, int ano, int numeroSocios) {
		this.nombre = nombre;
		this.ano = ano;
		this.numeroSocios = numeroSocios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroSocios() {
		return numeroSocios;
	}

	public void setNumeroSocios(int numeroSocios) {
		this.numeroSocios = numeroSocios;
	}
	
	
}

	

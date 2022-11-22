package es.studium.ejercicio7;

public class Coche {
	
	// Atributos
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean gasolina;
	
	// Constructor vacío
	
		public Coche () 
		{
			fabricante = "";
			modelo = "";
			ano = 0;
			gasolina = false;
		}
		
	// Constructor por parámetros
		
	public Coche (String fabric, String model, int year, boolean gasofa) 
	{
		fabricante = fabric;
		modelo = model;
		ano = year;
		gasolina = gasofa;
	}
	
	// Métodos inspectores
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFabricacion() {
		return ano;
	}
	public void setFabricacion(int fabricacion) {
		this.ano = fabricacion;
	}
	public boolean getGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	
	
}


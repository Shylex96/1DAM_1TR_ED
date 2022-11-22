package es.studium.ejercicio8;

public class Musico {
	
	private String nom;
	private char sexo;
	
	public Musico()
	{
		nom = "";
		sexo = ' ';
	}
	
	public Musico (String nam, char afin)
	{
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}

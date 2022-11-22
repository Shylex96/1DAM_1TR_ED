package es.studium.ejercicio5;

public class Perro {
	
		// Atributos
		
		private String raza;
		private String tama�o;
		private String color;
		private int edad;
		
		// Constructor vac�o
		
		public Perro () 
		{
			raza = "";
			tama�o = "";
			color = "";
			edad = 0;
		}
		// Constructor por par�metros
		
		public Perro (String tipo, String weight, int age, String bright) 
		{
			raza = tipo;
			tama�o = weight;
			color = bright;
			edad = age;
		}
		
		// M�todos inspectores

		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}

		public String getTama�o() {
			return tama�o;
		}

		public void setTama�o(String tama�o) {
			this.tama�o = tama�o;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
	}
		
		


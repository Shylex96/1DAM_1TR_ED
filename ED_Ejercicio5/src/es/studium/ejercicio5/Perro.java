package es.studium.ejercicio5;

public class Perro {
	
		// Atributos
		
		private String raza;
		private String tamaño;
		private String color;
		private int edad;
		
		// Constructor vacío
		
		public Perro () 
		{
			raza = "";
			tamaño = "";
			color = "";
			edad = 0;
		}
		// Constructor por parámetros
		
		public Perro (String tipo, String weight, int age, String bright) 
		{
			raza = tipo;
			tamaño = weight;
			color = bright;
			edad = age;
		}
		
		// Métodos inspectores

		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}

		public String getTamaño() {
			return tamaño;
		}

		public void setTamaño(String tamaño) {
			this.tamaño = tamaño;
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
		
		


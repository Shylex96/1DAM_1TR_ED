package es.studium.ejercicio5;


public class TestPerro {
	public static void main(String[] args) {
		
		// Valores por defecto
		
		Perro PerroX = new Perro ();
		PerroX.setRaza("Husky");
		PerroX.setTamaño("Grande");
		PerroX.setColor("Marrón");
		PerroX.setEdad(2);
		
		System.out.println(PerroX.getRaza());
		System.out.println(PerroX.getTamaño());
		System.out.println(PerroX.getColor());
		System.out.println(PerroX.getEdad());
	
		// Constructor con parámetros:
		
		Perro PerroY = new Perro ("Husky", "Grande", 2, "Marrón"); 
				
		System.out.println(PerroY.getRaza() + " " + PerroY.getTamaño() + " " +  PerroY.getEdad() + " " + PerroY.getColor());
		
		Perro PerroZ = new Perro ("Golden", "Mediano", 7, "Dorado"); 
		
		System.out.println(PerroZ.getRaza() + " " + PerroZ.getTamaño() + " " +  PerroZ.getEdad() + " " + PerroZ.getColor());
	}
}

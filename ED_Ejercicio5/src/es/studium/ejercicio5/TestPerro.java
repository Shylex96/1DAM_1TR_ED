package es.studium.ejercicio5;


public class TestPerro {
	public static void main(String[] args) {
		
		// Valores por defecto
		
		Perro PerroX = new Perro ();
		PerroX.setRaza("Husky");
		PerroX.setTama�o("Grande");
		PerroX.setColor("Marr�n");
		PerroX.setEdad(2);
		
		System.out.println(PerroX.getRaza());
		System.out.println(PerroX.getTama�o());
		System.out.println(PerroX.getColor());
		System.out.println(PerroX.getEdad());
	
		// Constructor con par�metros:
		
		Perro PerroY = new Perro ("Husky", "Grande", 2, "Marr�n"); 
				
		System.out.println(PerroY.getRaza() + " " + PerroY.getTama�o() + " " +  PerroY.getEdad() + " " + PerroY.getColor());
		
		Perro PerroZ = new Perro ("Golden", "Mediano", 7, "Dorado"); 
		
		System.out.println(PerroZ.getRaza() + " " + PerroZ.getTama�o() + " " +  PerroZ.getEdad() + " " + PerroZ.getColor());
	}
}

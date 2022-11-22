package es.ejercicio;

// Constructor vacío (sin parámetros):

public class Principal {
	
	public static void main(String[] args) {
		Persona personaE = new Persona();
		personaE.setNombre("Esteban");
		personaE.setApellidos("Albarrán Tirado");
		personaE.setDomicilio("C/Estrella Vega 14");
		personaE.setDNI("77868516S");
		personaE.setTelefono(686856307);
		
		System.out.println(personaE.getNombre() + " " + personaE.getApellidos() + " " +  personaE.getDomicilio() + " " + personaE.getDNI() + " " + personaE.getTelefono());
		//		System.out.println(personaE.getNombre() + " " + personaE.getApellidos() + " " + personaE.getDomicilio()+ " " + personaE.getDNI()+ " " + personaE.getTelefono());

		// Constructor con parámetros:
		
		Persona personaEJ = new Persona ("Jaime", "Gonzalo Álvarez", "C/Albarán 12", "77868574H", 677563606); 
		
		System.out.println(personaEJ.getNombre() + " " + personaEJ.getApellidos() + " " +  personaEJ.getDomicilio() + " " + personaEJ.getDNI() + " " + personaEJ.getTelefono());
	}
	
	
}

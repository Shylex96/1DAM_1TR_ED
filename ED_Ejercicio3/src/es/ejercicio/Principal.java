package es.ejercicio;

// Constructor vac�o (sin par�metros):

public class Principal {
	
	public static void main(String[] args) {
		Persona personaE = new Persona();
		personaE.setNombre("Esteban");
		personaE.setApellidos("Albarr�n Tirado");
		personaE.setDomicilio("C/Estrella Vega 14");
		personaE.setDNI("77868516S");
		personaE.setTelefono(686856307);
		
		System.out.println(personaE.getNombre() + " " + personaE.getApellidos() + " " +  personaE.getDomicilio() + " " + personaE.getDNI() + " " + personaE.getTelefono());
		//		System.out.println(personaE.getNombre() + " " + personaE.getApellidos() + " " + personaE.getDomicilio()+ " " + personaE.getDNI()+ " " + personaE.getTelefono());

		// Constructor con par�metros:
		
		Persona personaEJ = new Persona ("Jaime", "Gonzalo �lvarez", "C/Albar�n 12", "77868574H", 677563606); 
		
		System.out.println(personaEJ.getNombre() + " " + personaEJ.getApellidos() + " " +  personaEJ.getDomicilio() + " " + personaEJ.getDNI() + " " + personaEJ.getTelefono());
	}
	
	
}

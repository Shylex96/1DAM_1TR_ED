package es.ejercicio.empleado;


public class Principal {

	public static void main(String[] args) {
		// Valores por defecto
		Empleado EmpleadoX = new Empleado ();
		EmpleadoX.setNombre("Eugenio");
		EmpleadoX.setApellidos("Ramírez Olivero");
		EmpleadoX.setDni("123456789S");
		EmpleadoX.setDomicilio("C/Estrella Ares nº10");
		EmpleadoX.setPuesto("Gerentinio");
		EmpleadoX.setTelefono(666555666);
		
		System.out.println(EmpleadoX.getNombre());
		System.out.println(EmpleadoX.getApellidos());
		System.out.println(EmpleadoX.getDni());
		System.out.println(EmpleadoX.getDomicilio());
		System.out.println(EmpleadoX.getPuesto());
		System.out.println(EmpleadoX.getTelefono());
		
		// Valores asignados 
		Empleado EmpleadoY = new Empleado ("Jorge", "Sánchez García", "34231232", "Avda, La Paz, nº3", "Programador", 954654756);
		System.out.println(EmpleadoY.getNombre() + " " + EmpleadoY.getApellidos() + " " +  EmpleadoY.getDni() + " " + EmpleadoY.getDomicilio() + " " + EmpleadoY.getPuesto() + " " + EmpleadoY.getTelefono());
	}
	
	
}

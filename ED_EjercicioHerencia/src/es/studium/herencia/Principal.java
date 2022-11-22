package es.studium.herencia;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Gerardo", "Javilenti Maldonini", "C/Andevás Rocío nº5", 645978215,
				"78516644H", "Camarero");
		System.out.println(
				"El empleado " + empleado1.getNombre() + " " + empleado1.getApellidos() + "\n" + "Con domicilio: "
						+ empleado1.getDomicilio() + "\n" + "Telefono de contacto: " + empleado1.getTelefono() + "\n"
						+ "Con DNI: " + empleado1.getDni() + "\n" + "Ocupa el puesto: " + empleado1.getPuesto());

		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Luciano");
		empleado2.setApellidos("García López");
		empleado2.setDomicilio("C/Pragtón nº 14");
		empleado2.setTelefono(650498716);
		empleado2.setDni("59716458P");
		empleado2.setPuesto("Jefe de sala");

		System.out.println("\n" + "El empleado " + empleado2.getNombre() + " " + empleado2.getApellidos() + "\n"
				+ "Con domicilio: " + empleado2.getDomicilio() + "\n" + "Telefono de contacto: "
				+ empleado2.getTelefono() + "\n" + "Con DNI: " + empleado2.getDni() + "\n" + "Ocupa el puesto: "
				+ empleado2.getPuesto());

		Consejero consejero1 = new Consejero("Esteban", "Albarrán Tirado", "C/ Estrella Canopus 14", 686856307, "77868516S", "Informático");
		System.out.println("\nEl empleado " + consejero1.getNombre() + " " + consejero1.getApellidos() + "\nDomicilio: " + consejero1.getDomicilio() + "\nTeléfono de contacto: " + consejero1.getTelefono() + "\nDNI: " +consejero1.getDni() + "\nPuesto: " +consejero1.getPuesto());
	}

}

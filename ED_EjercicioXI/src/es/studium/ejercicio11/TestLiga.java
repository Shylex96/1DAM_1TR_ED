package es.studium.ejercicio11;

public class TestLiga {

	public static void main(String[] args) {

		Equipo e1 = new Equipo("Doblem F.C.", 1976, 352498);
		Equipo e2 = new Equipo("Abstención F.C.", 1996, 5506184);

		Futbolista f1 = new Futbolista("Nombre del futbolista 1", "Apellidos del futbolista 1", true, e1);
		Futbolista f2 = new Futbolista("Nombre del futbolista 2", "Apellidos del futbolista 2", true, e2);
		Futbolista f3 = new Futbolista("Nombre del futbolista 3", "Apellidos del futbolista 3", false, e2);
		Futbolista f4 = new Futbolista("Nombre del futbolista 4", "Apellidos del futbolista 4", true, e1);

		System.out.println("El futbolista: " + "\n" + f1.getNombre() + "\n" + f1.getApellido() + "\n"
				+ "¿Es comunitario?: " + f1.getEsComunitario() + "\n" + f1.getEquipo().getNombre() + " "
				+ ", que tiene como cantidad de miembros: " + f1.getEquipo().getNumeroSocios() + "\n");

		System.out.println("El futbolista: " + "\n" + f2.getNombre() + "\n" + f2.getApellido() + "\n"
				+ "¿Es comunitario?: " + f2.getEsComunitario() + "\n" + f2.getEquipo().getNombre() + " "
				+ ", que tiene como cantidad de miembros: " + f2.getEquipo().getNumeroSocios() + "\n");
		
		System.out.println("El futbolista: " + "\n" + f3.getNombre() + "\n" + f3.getApellido() + "\n"
				+ "¿Es comunitario?: " + f3.getEsComunitario() + "\n" + f3.getEquipo().getNombre() + " "
				+ ", que tiene como cantidad de miembros: " + f3.getEquipo().getNumeroSocios() + "\n");
		
		System.out.println("El futbolista: " + "\n" + f4.getNombre() + "\n" + f4.getApellido() + "\n"
				+ "¿Es comunitario?: " + f4.getEsComunitario() + "\n" + f4.getEquipo().getNombre() + " "
				+ ", que tiene como cantidad de miembros: " + f4.getEquipo().getNumeroSocios() + "\n");

	}

}

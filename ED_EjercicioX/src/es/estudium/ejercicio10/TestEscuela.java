package es.estudium.ejercicio10;

public class TestEscuela {

	public static void main(String[] args) {

		Aula au1 = new Aula("Aula de DAW:", 25);
		Aula au2 = new Aula("Aula de DAM:", 30);

		Alumno a17 = new Alumno("Nombre del alumno 17", "Apellidos del alumno 17", 18, true, au1);
		Alumno a24 = new Alumno("Nombre del alumno 24", "Apellidos del alumno 24", 19, true, au2);
		Alumno a8 = new Alumno("Nombre del alumno 8", "Apellidos del alumno 8", 18, true, au2);

		System.out.println("El alumno: " + "\n" + a17.getNombre() + "\n" + a17.getApellidos() + "\n" + "Con edad: "
				+ a17.getEdad() + "\n" + "¿Ha pagado?: " + a17.getHaPagado() + "\n" + a17.getAula().getNombre() + " " + "Tiene capacidad de "+a8.getAula().getNumeroAlumnos() + "\n");
		System.out.println("El alumno: " + "\n" + a24.getNombre() + "\n" + a24.getApellidos() + "\n" + "Con edad: "
				+ a24.getEdad() + "\n" + "¿Ha pagado?: " + a24.getHaPagado() + "\n" + a24.getAula().getNombre() + " " + "Tiene capacidad de "+a8.getAula().getNumeroAlumnos() + "\n");
		System.out.println("El alumno: " + "\n" + a8.getNombre() + "\n" + a8.getApellidos() + "\n" + "Con edad: "
				+ a8.getEdad() + "\n" + "¿Ha pagado?: " + a8.getHaPagado() + "\n" + a8.getAula().getNombre() +" " + "Tiene capacidad de "+a8.getAula().getNumeroAlumnos() + "\n");
	}
}

package es.estudium.practica;

public class TestAcademiaDeIdiomas {

	public static void main(String[] args) {

		// Los dos centros disponibles:

		Centro centro1 = new Centro("Escuela de Ingl�s", "Reyes Cat�licos, 14", 558756425);
		Centro centro2 = new Centro("Escuela de Franc�s", "Crist�bal Col�n, 92", 558798449);

		// Centro creado para mi solo:
		Centro centro3 = new Centro("Grupo Studium", "Av. Pueblo Saharui 7A, 7B", 578946449);

		// Los cuatro tipos de asignatura disponibles:

		Asignatura asignatura1 = new Asignatura("Ingl�s B1", 180, "56846I");
		Asignatura asignatura2 = new Asignatura("Ingl�s B2", 180, "51246I");
		Asignatura asignatura3 = new Asignatura("Franc�s B1", 180, "57946F");
		Asignatura asignatura4 = new Asignatura("Franc�s A2", 180, "57526F");

		// Asignatura para mi solo:
		Asignatura asignatura5 = new Asignatura("Desarrollo de Aplicaciones Web", 2500, "67214D");

		// Los 6 alumnos (5 existentes + yo mismo):

		Alumno alumno1 = new Alumno("Ana Abel", "Paseo de Am�rica, 15", 545, 7.00f, centro1, asignatura1);
		Alumno alumno2 = new Alumno("Benito Bueno", "Reyes Cat�licos, 16", 545, 6.00f, centro1, asignatura2);
		Alumno alumno3 = new Alumno("Carmen Cano", "Reyes Cat�licos, 2", 545, 5.00f, centro1, asignatura1);
		Alumno alumno4 = new Alumno("Esteban Escalera", "Isabel la Cat�lica, 28", 545, 9.00f, centro2, asignatura3);
		Alumno alumno5 = new Alumno("Francisco Farf�n", "Crist�bal Col�n, s/n", 545, 8.50f, centro2, asignatura4);

		// Yo como alumno estoy aqu�:
		Alumno alumno6 = new Alumno("Esteban Albarr�n", "Av. Pueblo Saharaui, 7A, 7B", 545, 10.00f, centro3,
				asignatura5);

		// 1.Mostrar por pantalla las direcciones de todos los centros:
		System.out.println("Nombre del centro 1 es: " + centro1.getNombre() + "\nDirecci�n: " + centro1.getDireccion());
		// Syso vac�o para mayor est�tica al contenido por consola (salto de l�nea)
		System.out.println();
		System.out.println("Nombre del centro 2 es: " + centro2.getNombre() + "\nDirecci�n: " + centro2.getDireccion());

		// 2.Mostrar por pantalla la direcci�n del centro en el que est� matriculada
		// Carmen. Ej.: La alumna: NNN, est� matriculada en el Centro: CCC. Donde NNN es
		// el nombre de la alumna y CCC el nombre del Centro.

		System.out.println(
				"\nLa alumna " + alumno3.getNombre() + ", est� matriculada en el centro " + alumno3.getCentro().getNombre());

		// 3. Mostrar por pantalla la nota que Benito ha sacado en el B2. Ej.: La nota
		// que ha sacado NNN en AAA es un NTNTNT. Donde NNN es el nombre del alumno, AAA
		// es la asignatura y NTNTNT es la nota.

		System.out.println("\nLa nota que ha sacado " + alumno2.getNombre() + " en " + alumno2.getAsignatura().getNombre()
				+ " es un " + alumno2.getNotaAsignatura());

	}

}

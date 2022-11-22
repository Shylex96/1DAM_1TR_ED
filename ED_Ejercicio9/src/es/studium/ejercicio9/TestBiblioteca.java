package es.studium.ejercicio9;

public class TestBiblioteca {

	public static void main(String[] args) 
	{

		Autor autor1 = new Autor("Nombre del Autor 1", "Apellidos del Autor 1", "Nacionalidad del Autor 1");

		Libro libro1 = new Libro("Título 1", autor1, 1999, "Edtitorial 1", 520);

		System.out.println(libro1.getTitulo() + "\n" + libro1.getAutor().getNombre() + " "
				+ libro1.getAutor().getApellidos() + "\n" + libro1.getAutor().getNacionalidad()+"\n");

		Autor autor2 = new Autor();
		autor2.setNombre("Nombre del Autor 2");
		autor2.setApellidos("Apellidos del Autor 2");
		autor2.setNacionalidad("Española");

		Libro libro2 = new Libro();
		libro2.setTitulo("Título del Libro 2");
		libro2.setAutor(autor2);
		libro2.setEditorial("Editorial libro 2");
		libro2.setAno(2000);
		libro2.setNumpaginas(240);

		System.out.println("El libro " + libro2.getTitulo() + " pertenece al autor: " + libro2.getAutor().getNombre()
				+ " " + libro2.getAutor().getApellidos() + " de nacionalidad " + libro2.getAutor().getNacionalidad()
				+ "\nAño de publicación del libro: " + libro2.getAno() + "\n" + libro2.getEditorial() + "Contiene: " +libro2.getNumpaginas());
	}
}

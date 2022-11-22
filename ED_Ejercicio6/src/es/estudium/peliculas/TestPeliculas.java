package es.estudium.peliculas;

public class TestPeliculas {

	public static void main(String[] args) {
		Peliculas Pelis1 = new Peliculas ();
		Pelis1.setTitulo("El día del mañana");
		Pelis1.setAño(1996);
		Pelis1.setDuracion("1 hora y 45 minutos");
		
		Peliculas Pelis2 = new Peliculas ();
		Pelis2.setTitulo("Gerardo entre gerardos");
		Pelis2.setAño(2006);
		Pelis2.setDuracion("1 hora y 21 minutos");
		
		Peliculas Pelis3 = new Peliculas ();
		Pelis3.setTitulo("Antuan y el desamor");
		Pelis3.setAño(1989);
		Pelis3.setDuracion("2 hora y 11 minutos");
		
		Peliculas Pelis4 = new Peliculas ();
		Pelis4.setTitulo("Los tres javaguerreros");
		Pelis4.setAño(2013);
		Pelis4.setDuracion("2 hora y 28 minutos");
		
		Peliculas Pelis5 = new Peliculas ();
		Pelis5.setTitulo("JavascripTown");
		Pelis5.setAño(2015);
		Pelis5.setDuracion("1 hora y 15 minutos");
		
		System.out.println(Pelis1.getTitulo());
		System.out.println(Pelis1.getAño());
		System.out.println(Pelis1.getDuracion());
	
		System.out.println(Pelis2.getTitulo());
		System.out.println(Pelis2.getAño());
		System.out.println(Pelis2.getDuracion());
	}
	

}

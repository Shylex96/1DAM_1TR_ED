package es.studium.ejercicio8;

public class TestOrquesta {

	public static void main(String[] args) 
	{
		
		Instrumento instrumento1 = new Instrumento();
		instrumento1.setNombre("Piano");
		instrumento1.setAfinacion('Y');
		
		Musico musico1 = new Musico ();
		musico1.setNom("Alberto");
		musico1.setSexo('H');
		
		System.out.println("Hola, mi nombre es "+musico1.getNom() + " " + "y toco el " +instrumento1.getNombre());
		
		Instrumento instrumento2 = new Instrumento();
		instrumento2.setNombre("Laúd");
		instrumento2.setAfinacion('Y');
		
		Musico musico2 = new Musico ();
		musico2.setNom("Álvaro");
		musico2.setSexo('H');
		
		System.out.println("Hola, mi nombre es "+musico2.getNom() + " " + "y toco el " +instrumento2.getNombre());
		
		
	}

}

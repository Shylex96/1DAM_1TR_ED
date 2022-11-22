package es.studium.ejercicio7;

public class TestCarrera {

	public static void main(String[] args) {
		Coche Cochecito1 = new Coche ();
		Cochecito1.setFabricante("Alfa Romeo"); // fabric
		Cochecito1.setFabricacion(2016); //ano
		Cochecito1.setModelo("Stelvio"); //model
		Cochecito1.setGasolina(true); //boolean
		
		System.out.println(Cochecito1.getFabricante());
		System.out.println(Cochecito1.getFabricacion());
		System.out.println(Cochecito1.getModelo());
		System.out.println(Cochecito1.getGasolina());
		
		Piloto piloto1 = new Piloto ("Fernando Alosno", "España");
		System.out.println("Hola, mi nombre es "+piloto1.getNombre()+ " " +"de "+piloto1.getNacionalidad());
		
		System.out.print("\n");
		
		Coche Cochecito2 = new Coche ();
		Cochecito2.setFabricacion(2014); //ano
		Cochecito2.setFabricante("Audi"); // fabric
		Cochecito2.setModelo("A4"); //model
		Cochecito2.setGasolina(true); //boolean
		
		System.out.println(Cochecito2.getFabricante());
		System.out.println(Cochecito2.getFabricacion());
		System.out.println(Cochecito2.getModelo());
		System.out.println(Cochecito2.getGasolina());
		
		Piloto piloto2 = new Piloto ("Lewis Hamillton", "Reino Unido");
		System.out.println("Hola, mi nombre es "+piloto2.getNombre()+ " " +"de "+piloto2.getNacionalidad());
		
	
	}
	

}

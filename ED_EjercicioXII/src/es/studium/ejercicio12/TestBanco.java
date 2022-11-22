package es.studium.ejercicio12;

public class TestBanco {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Antonio", "45261516S", "C/Rosaleda nº12");
		Cliente cliente2 = new Cliente("Beatriz", "45261516S", "C/Rosaleda nº12");
		
		Cuenta cuenta1 = new Cuenta("ES 34 1485 9453 9012 8450 1824", 100.0, cliente1);
		Cuenta cuenta2 = new Cuenta("ES 34 1485 9453 9012 8450 1824", 200.0, cliente2);
		
		System.out.println("La cuenta de: " + cuenta1.getCliente().getNombre() + " " + "tiene " +cuenta1.getSaldo() + " euros.");
		System.out.println("La cuenta de: " + cuenta2.getCliente().getNombre() + " " + "tiene " +cuenta2.getSaldo() + " euros.");
		
		cuenta2.setSaldo(cuenta2.getSaldo() - 50.0);
		cuenta1.setSaldo(cuenta1.getSaldo() + 50.0);
		
		System.out.println("La cuenta de " + cuenta1.getCliente().getNombre() + " tiene: " + cuenta1.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cuenta2.getCliente().getNombre() + " tiene: " + cuenta2.getSaldo() + " euros.");
	}

}






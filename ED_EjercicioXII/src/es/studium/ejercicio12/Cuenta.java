package es.studium.ejercicio12;

public class Cuenta 
{
	
	private String numeroCuenta;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta ()
	{
		numeroCuenta = "";
		saldo = 0.0;
		cliente = new Cliente();
	}

	public Cuenta(String numeroCuenta, double saldo, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}

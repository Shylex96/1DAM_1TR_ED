package es.ejercicio.empleado;



public class Empleado {
		
	// Atributos declarados 
		
		private String nombre;
		private String apellidos;
		private String dni;
		private String domicilio;
		private String puesto;
		private int telefono;
		
		// Constructor vacío
		public Empleado() { // "Empleado" tiene que ser el nombre que le di a la clase arriba
			nombre = "";
			apellidos = "";
			dni = "";
			domicilio = "";
			puesto = "";
			telefono = 0 ;
		}
		
		// Constructor por parámetros
		public Empleado(String name, String lastname, String nif, String calle, String cargo, int tlf) {
			nombre = name;
			apellidos = lastname;
			dni = nif;
			domicilio = calle;
			puesto = cargo;
			telefono = tlf;
		}
		
		// Métodos inspectores

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getDomicilio() {
			return domicilio;
		}

		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}

		public String getPuesto() {
			return puesto;
		}

		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		
	}


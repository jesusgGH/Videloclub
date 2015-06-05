/**
 * Propiedades
 * 		dni: básica, cadena, consultable
 * 		nombre: básica, cadena, consultable, modificable
 * 
 * Funcionalidades
 * 		String toString()
 * 		int hashCode()
 * 
 * Interfaz
 * 		//consultores
 * 		String getDni()
 * 		String nombre()
 * 		//modificadores
 * 		void setNombre(String nombre)	
 */
public abstract class Persona {
	//atributos
	private String dni;
	private String nombre;
	//constructor sin parámetros
	public Persona(){
		dni = "";
		nombre = "";
	}
	//constructor con parámetros
	public Persona(String dni,String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}
	//consultores
	public abstract String getDni();
	public abstract String getNombre();
	//modificadores
	public abstract void setNombre(String nombre);
	//funcionalidades
	/**
	 * String toString()
	 */
	@Override
	public abstract String toString();
	@Override
	public abstract boolean equals(Object o);
	public abstract int compareTo(Persona p);
}

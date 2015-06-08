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
	public String toString(){
		return this.dni+" "+this.nombre;
	}
	@Override
	public boolean equals(Object o){
		boolean respuesta = false;
		if(o!=null & o instanceof Persona){
			Persona aux = (Persona) o;
			if(this.dni.equals(aux.dni)){
				respuesta = true;
			}
		}
		return respuesta;
	}
	public int compareTo(Persona p){
		int rtdo = 0;
		if(this.dni.compareTo(p.dni)>0){
			rtdo = 1;
		}
		else{
			if(this.dni.compareTo(p.dni)<0){
				rtdo = -1;
			}
		}
		return rtdo;
	}
}

import java.util.ArrayList;


public class GestionPersonas {
	private ArrayList<Persona> personas;
	public GestionPersonas(){
		personas = new ArrayList<Persona>();
	}
	public GestionPersonas(ArrayList<Persona> personas){
		this.personas = personas;
	}
	public ArrayList<Persona> getPersonas() {
		return personas;
	}
}

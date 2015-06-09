
public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		System.out.println(p1.toString());
		System.out.println();
		System.out.println();
		
		p1.setNombre("ramón");
		System.out.println(p1.toString());
		System.out.println();
		System.out.println();
		
		
		Persona p2 = new Persona("101d","pedro");
		System.out.println(p2.toString());
		System.out.println();
		System.out.println();
		
		
		Persona p3 = new Persona("202x","alberto");
		System.out.println(p3.toString());
		System.out.println();
		System.out.println();
		
		
		System.out.println("Pruebo el equals");
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p2));
		System.out.println(p3.equals(p3));
		System.out.println();
		System.out.println();
		
		
		System.out.println("Pruebo el compareTo");
		System.out.println(p2.compareTo(p3));
		System.out.println(p3.compareTo(p2));
		System.out.println(p2.compareTo(p2));
	}

}

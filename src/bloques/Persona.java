package bloques;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	static {		
		System.out.println("Ejecución bloque estático. Se ejecuta antes que el construtor y antes que el bloque no estático. Sólo se ejecuta 1 vez");
		++Persona.contadorPersonas;
	}
	
	{
		
		System.out.println("Ejecución de bloque no estático. Se ejecuta antes del constructor pero después del bloque estático. Se ejecuta cada vez que se crea un objeto.");
		this.idPersona=Persona.contadorPersonas++; 
		
	}
	
	public Persona() {
		System.out.println("Ejecución del constructor");
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}
	
	

}


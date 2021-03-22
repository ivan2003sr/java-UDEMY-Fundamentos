package bloques;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	static {		
		System.out.println("Ejecuci�n bloque est�tico. Se ejecuta antes que el construtor y antes que el bloque no est�tico. S�lo se ejecuta 1 vez");
		++Persona.contadorPersonas;
	}
	
	{
		
		System.out.println("Ejecuci�n de bloque no est�tico. Se ejecuta antes del constructor pero despu�s del bloque est�tico. Se ejecuta cada vez que se crea un objeto.");
		this.idPersona=Persona.contadorPersonas++; 
		
	}
	
	public Persona() {
		System.out.println("Ejecuci�n del constructor");
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


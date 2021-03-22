package bloques;

public class testBloque {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();// No se vuelve a ejecutar el bloque estático
		Persona persona3 = new Persona();
		System.out.println(persona3);

	}

}

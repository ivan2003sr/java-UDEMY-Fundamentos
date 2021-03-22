package genericos;

public class TestGenerico {
	public static void main(String[] args) {
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
		objetoInt.obtenerTipo();
		
		
		ClaseGenerica<String> objetoString = new ClaseGenerica<String>("Hola");
		objetoString.obtenerTipo();
	}

}

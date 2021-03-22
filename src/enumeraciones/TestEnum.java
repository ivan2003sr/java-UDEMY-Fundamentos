package enumeraciones;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println("D�a 1: " + Dias.LUNES);
		indicadorDia(Dias.MARTES);

		System.out.println("contintente 1 " + Continentes.AFRICA);
		System.out.println("Paises: " + Continentes.AFRICA.getPaises());

	}

	public static void indicadorDia(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer d�a");
			break;
		case MARTES:
			System.out.println("Segundo d�a");
			break;
		case MIERCOLES:
			System.out.println("Tercer d�a");
			break;
		case DOMINGO:
			System.out.println("S�ptimo d�a");
			break;
		case JUEVES:
			System.out.println("Cuarto d�a");
			break;
		case SABADO:
			System.out.println("Sexto d�a");
			break;
		case VIERNES:
			System.out.println("Quinto d�a");
			break;
		default:
			System.out.println("Eso no es un d�a");
			break;
		}
	}

}

package enumeraciones;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println("Día 1: " + Dias.LUNES);
		indicadorDia(Dias.MARTES);

		System.out.println("contintente 1 " + Continentes.AFRICA);
		System.out.println("Paises: " + Continentes.AFRICA.getPaises());

	}

	public static void indicadorDia(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer día");
			break;
		case MARTES:
			System.out.println("Segundo día");
			break;
		case MIERCOLES:
			System.out.println("Tercer día");
			break;
		case DOMINGO:
			System.out.println("Séptimo día");
			break;
		case JUEVES:
			System.out.println("Cuarto día");
			break;
		case SABADO:
			System.out.println("Sexto día");
			break;
		case VIERNES:
			System.out.println("Quinto día");
			break;
		default:
			System.out.println("Eso no es un día");
			break;
		}
	}

}

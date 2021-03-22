package peliculas.presentacion;

import java.util.Scanner;

import peliculas.negocio.CatalogoPeliculaImpl;
import peliculas.negocio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {

	public static void main(String[] args) {

		var opcion = -1;
		var scanner = new Scanner(System.in);
		ICatalogoPeliculas catalogo = new CatalogoPeliculaImpl();

		while (opcion != 0) {

			System.out.println("Elije una opci�n: \n" + "1. Iniciar cat�logo de pel�culas \n" + "2. Agregar pel�cula \n"
					+ "3. Listar Pel�culas \n" + "4. Buscar Pel�cula \n" + "0. Salir");
			opcion = Integer.parseInt(scanner.nextLine());

			switch (opcion) {
			case 1:
				
				catalogo.iniciarCatalogoPelicula();

				break;

			case 2:
				System.out.println("Introduce el nombre de la pel�cula");
				var nombrePelicula=scanner.nextLine();
				catalogo.agregarPelicula(nombrePelicula);

				break;

			case 3:
				
				catalogo.listarPeliculas();

				break;

			case 4:
				
				System.out.println("Introduce una pel�cula a buscar");
				var buscar=scanner.nextLine();
				catalogo.buscarPelicula(buscar);

				break;
				
			case 0:
				System.out.println("Hasta Pronto");
				break;
				
				default: 
					System.out.println("Opci�n no reconocida");
					break;
			}
		}
		
		scanner.close();

	}

}

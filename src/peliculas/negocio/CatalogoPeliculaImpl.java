package peliculas.negocio;

import peliculas.datos.AccesoDatosImpl;
import peliculas.datos.IAccesoDatos;
import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculaImpl implements ICatalogoPeliculas {

	public CatalogoPeliculaImpl() {

		this.datos = new AccesoDatosImpl();

	}

	@Override
	public void agregarPelicula(String nombrePelicula) {
		Pelicula pelicua = new Pelicula(nombrePelicula);
		boolean anexar = false;
		try {
			anexar = datos.existe(NOMBRE_RECURSO);
			datos.escribir(pelicua, NOMBRE_RECURSO, anexar);
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public void listarPeliculas() {
		try {
			var peliculas = this.datos.listar(NOMBRE_RECURSO);
			for (Pelicula pelicula : peliculas) {
				System.out.println("Película: " + pelicula);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public void buscarPelicula(String buscar) {
		@SuppressWarnings("unused")
		String resultado=null;
		try {
			resultado=this.datos.buscar(NOMBRE_RECURSO, buscar);
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}

	}

	@Override
	public void iniciarCatalogoPelicula() {
		try {
			if(this.datos.existe(NOMBRE_RECURSO)) {
				datos.borrar(NOMBRE_RECURSO);
				datos.crear(NOMBRE_RECURSO);
			}else {
				datos.crear(NOMBRE_RECURSO);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error al iniciar catálogo de películas");
			e.printStackTrace(System.out);
		}
	}

	private final IAccesoDatos datos;

}

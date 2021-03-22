package peliculas.negocio;

public interface ICatalogoPeliculas {
	String NOMBRE_RECURSO = "peliculas.txt";

	void agregarPelicula(String nombrePelicula);

	void listarPeliculas();

	void buscarPelicula();

	void iniciarCatalogoPelicula();

}

package peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculas implements IAccesoDatos {

	public CatalogoPeliculas() {

	}

	@Override
	public boolean existe(String nombreRecurso) throws AccesoDatosEx {

		File archivo = new File(nombreRecurso);

		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {

		var archivo = new File(nombreRecurso);
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();

			while (linea != null) {
				Pelicula pelicula = new Pelicula(linea);
				peliculas.add(pelicula);
			}
			entrada.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al listar películas" + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al listar películas: " + e.getMessage());
		}

		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

		var archivo = new File(nombreRecurso);
		try {
			var salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito información al archivo: " + pelicula);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepción al escribir películas: " + e.getMessage());
		}

	}

	@Override
	public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {

		var archivo = new File(nombreRecurso);
		String resultado = null;
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			int indice = 1;
			while (linea != null) {
				if (buscar != null && buscar.equalsIgnoreCase(linea)) {
					resultado = "Película " + linea + " encontrada en el índice " + indice;
					break;
				}
				linea = entrada.readLine();
				indice++;

			}
			entrada.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al buscar películas: " + e.getMessage());
		} catch (IOException e) {

			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al buscar películas: " + e.getMessage());
		}

		return null;
	}

	@Override
	public void crear(String nombreRecurso) throws AccesoDatosEx {

		var archivo = new File(nombreRecurso);

		try {
			var salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AccesoDatosEx("Excepción al crear archivo: " + e.getMessage());
		}

	}

	@Override
	public void borrar(String nombreRecurso) throws AccesoDatosEx {
		var archivo = new File(nombreRecurso);
		if (archivo.exists())
			archivo.delete();
		System.out.println("Se ha borrado el archivo");

	}

}

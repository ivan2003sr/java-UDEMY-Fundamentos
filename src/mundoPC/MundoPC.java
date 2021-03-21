package mundoPC;

import com.ivan2003sr.mundoPC.Computadora;
import com.ivan2003sr.mundoPC.Monitor;
import com.ivan2003sr.mundoPC.Orden;
import com.ivan2003sr.mundoPC.Raton;
import com.ivan2003sr.mundoPC.Teclado;

public class MundoPC {
	
	public static void main(String[] args) {
		Monitor monitorHP= new Monitor("HP",13);
		Teclado tecladoHP= new Teclado("bluetooth","HP");
		Raton ratonHP = new Raton("bluetooth","HP");
		Computadora computadoraHP= new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
		
		Monitor monitorGamer= new Monitor("Gamer",34);
		Teclado tecladoGamer= new Teclado("bluetooth","Gamer");
		Raton ratonGamer = new Raton("bluetooth","Gamer");
		Computadora computadoraGamer= new Computadora("Computadora Gamer",monitorGamer,tecladoHP,ratonGamer);
		Computadora computadoraFull = new Computadora("Compu full",monitorHP,tecladoGamer,ratonHP);
		
		Orden orden1= new Orden();
		
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		orden1.agregarComputadora(computadoraFull);
		
		orden1.mostrarOrden();
		
		
	
		
		
		
	}

}

package enumeraciones;

public enum Continentes {
	AFRICA(53), EUROPA(46), ASIA(44), OCEANÍA(14), AMÉRICA(34);
	
	private final int paises;
	
	Continentes(int paises){
		this.paises=paises;
	}
	
	public int getPaises() {
		return this.paises;
	}

}

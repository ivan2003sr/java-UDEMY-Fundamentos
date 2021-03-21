package com.ivan2003sr.mundoPC;

public class Monitor {
	
	private final int idMonitor;
	private String marca;
	private double tamagno;
	public static int contadorMonitores;
	
	private Monitor() {
		this.idMonitor=++Monitor.contadorMonitores;
	}
	
	public Monitor (String marca, double tamagno) {
		this();
		this.marca=marca;
		this.tamagno=tamagno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamagno() {
		return tamagno;
	}

	public void setTamagno(double tamagno) {
		this.tamagno = tamagno;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamagno=" + tamagno + "]";
	}
	
	
	
}

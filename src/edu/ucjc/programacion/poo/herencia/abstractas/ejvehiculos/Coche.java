package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class Coche extends Vehiculo {
	
	private String matricula;
	private int numPuertas;
	private String tipoCombus;
	public Coche(String marca, String modelo, int añoFab, String matricula, int numPuertas, String tipoCombus) {
		super(marca, modelo, añoFab);
		this.matricula = matricula;
		this.numPuertas = numPuertas;
		this.tipoCombus = tipoCombus;
	}
	public Coche(String marca, String modelo, int añoFab) {
		super(marca, modelo, añoFab);
		// TODO Auto-generated constructor stub
	}
	
	public void arrancar() {
		System.out.println("Arrancando");
	}
	
	public void parar() {
		System.out.println("Parando");
	}
	
	

}

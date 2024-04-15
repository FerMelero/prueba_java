package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class Bicicleta extends Vehiculo {
	
	private int numMarchas;

	public Bicicleta(String marca, String modelo, int añoFab, int numMarchas) {
		super(marca, modelo, añoFab);
		this.numMarchas = numMarchas;
	}

	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String marca, String modelo, int añoFab) {
		super(marca, modelo, añoFab);
		// TODO Auto-generated constructor stub
	}
	
	public void inflarRuedas() {
		System.out.println("Inflando ruedas de la bicicleta");
	}

}

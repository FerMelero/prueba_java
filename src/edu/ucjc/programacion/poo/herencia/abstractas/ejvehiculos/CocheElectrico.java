package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class CocheElectrico extends Coche {

	private double velRecarga;

	public CocheElectrico(String marca, String modelo, int añoFab, String matricula, int numPuertas, String tipoCombus,
			double velRecarga) {
		super(marca, modelo, añoFab, matricula, numPuertas, tipoCombus);
		this.velRecarga = velRecarga;
	}

	public double getVelRecarga() {
		return velRecarga;
	}

	public void setVelRecarga(double velRecarga) {
		this.velRecarga = velRecarga;
	}
	
	
	
	

	
}

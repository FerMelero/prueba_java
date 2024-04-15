package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class SideCar extends Moto {

	private double tamaño;

	

	public SideCar(String marca, String modelo, int añoFab, String matricula, int cilindrada, double tamaño) {
		super(marca, modelo, añoFab, matricula, cilindrada);
		// TODO Auto-generated constructor stub
		this.tamaño = tamaño;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public void desmontar() {
		System.out.println("Desmontando sidecar de la moto");
	}

}

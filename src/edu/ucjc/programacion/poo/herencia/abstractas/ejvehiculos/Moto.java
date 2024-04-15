package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public class Moto extends Vehiculo {
	
	private String matricula;
	private int cilindrada;
	
	public Moto(String marca, String modelo, int añoFab, String matricula, int cilindrada) {
		super(marca, modelo, añoFab);
		this.matricula = matricula;
		this.cilindrada = cilindrada;
	}
	
	public void arrancar() {
		System.out.println("Moto arrancada");
	}
	
	public void parar() {
		System.out.println("Parando moto");
	}
	
	
	
	

}

package edu.ucjc.programacion.poo.composicion.carreracoches;

import edu.ucjc.programacion.poo.composicion.coche.Motor;
import java.util.Random;

public class Coche {

	String escuderia;
	Motor motor;
	int numero;
	Piloto piloto;
	int velocidad;
	int avance;
	
	public void correr() {
	    // Calcular el avance sumando la velocidad del coche y la experiencia del piloto
		int randomNumber = (int) (Math.random() * 101);
	    this.avance += velocidad + piloto.getExperiencia()+randomNumber;
	}



	public Coche(String escuderia, Motor motor, int numero, Piloto piloto, int velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}

	

}
package edu.ucjc.programacion.poo.herencia.ejs_instrumentos;

import java.util.Random;

// Clase padre
public class Instrumento {

	private String nombre;
	private String tipo;
	private double precio;
	private String marca;
	private boolean afinado;

	public Instrumento(String nombre, String tipo, int precio, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", marca=" + marca;
	}

	void afinar() {
		double numero = Math.random() * 10;
		// if (numero <= 8) {
		// this.afinado = true;
		// }

		// Operador ternario
		this.afinado = numero <= 8 ? true : false;
	}

	protected void tocar() {
		if (this.afinado) {
			System.out.println("El instrumento " + this.nombre + " está tocando correctamente");
		} else {
			System.out.println("El instrumento " + this.nombre + " no está tocando correctamente");
		}
	}

}

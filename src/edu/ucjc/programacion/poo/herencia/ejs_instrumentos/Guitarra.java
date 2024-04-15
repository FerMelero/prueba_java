package edu.ucjc.programacion.poo.herencia.ejs_instrumentos;

public class Guitarra extends Instrumento {

	private int numCuerdas;
	private String material;

	public Guitarra(String nombre, String tipo, int precio, String marca, int numCuerdas, String material) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + "]";
	}

	@Override
	public void tocar() {
		this.isAfinado();
		System.out.println("Se está tocando la guitarra " + (this.isAfinado() ? "bien" : "mal"));

	}

}

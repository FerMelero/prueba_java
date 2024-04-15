package edu.ucjc.programacion.poo.herencia.ejs_instrumentos;

public class Bateria extends Instrumento {

	private int num_timbales;
	private int num_platos;

	public Bateria(String nombre, String tipo, int precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub

	}

	public Bateria(String nombre, String tipo, int precio, String marca, int num_timbales, int num_platos) {
		super(nombre, tipo, precio, marca);
		this.num_timbales = num_timbales;
		this.num_platos = num_platos;
	}

	public int getNum_timbales() {
		return num_timbales;
	}

	public void setNum_timbales(int num_timbales) {
		this.num_timbales = num_timbales;
	}

	public int getNum_platos() {
		return num_platos;
	}

	public void setNum_platos(int num_platos) {
		this.num_platos = num_platos;
	}

	@Override
	public String toString() {
		return "Bateria [num_timbales=" + num_timbales + ", num_platos=" + num_platos + "]" + super.toString();

	}

	public void aporrear() {
		System.out.println("Aporreando batería");
	}

}

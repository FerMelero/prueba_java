package edu.ucjc.programacion.poo.interfaze;

public class Empleado extends Persona implements Empleable {

	private int id;
	private int antiguedad;

	public Empleado(String dni, String nombre, int id, int antiguedad) {
		super(dni, nombre);
		this.id = id;
		this.antiguedad = antiguedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public void fichar() {
		System.out.println("Fichando al empleado "+ this.getNombre() + " con ID " + this.id);

	}

	@Override
	public void insert() {
		System.out.println(
				"Insertando empleado con ID " + this.id + " con una antigüedad de " + this.antiguedad + "años");
		super.insert();
	}

}

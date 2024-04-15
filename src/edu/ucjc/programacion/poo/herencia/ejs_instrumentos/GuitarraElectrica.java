package edu.ucjc.programacion.poo.herencia.ejs_instrumentos;

public class GuitarraElectrica extends Guitarra {

	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, int precio, String marca, int numCuerdas, String material,
			double potencia) {
		super(nombre, tipo, precio, marca, numCuerdas, material);
		// TODO Auto-generated constructor stub
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + "]";
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		super.tocar();
		
		System.out.println("Es una guitarra eléctrica");
	}
	
	
	
	
	
	

}

package edu.ucjc.programacion.poo.herencia;
// Para sobreescribir un me´todo, deben tener el mismo nombre, devolver los mismo, ser del mismo tipo
public class ClaseHija1 extends ClasePadre {
	private String atributo2;

	public ClaseHija1(String atributo1, int contador, String atributo2) {
		super(atributo1, contador);
		this.atributo2 = atributo2;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	
	@Override
	public void metodo1() {
		super.metodo1();
		System.out.println("Método 1 de la clase hija");
	}
	
	@Override
	public String toString() {
		return "ClaseHija1 [atributo2 = " + atributo2 + getContador() + "]";
	}
}

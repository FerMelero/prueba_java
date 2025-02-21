package edu.ucjc.programacion.poo.herencia.abstractas.ejvehiculos;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int añoFab;

    public Vehiculo(String marca, String modelo, int añoFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFab = añoFab;
    }

    public Vehiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public abstract void acelerar();

    public abstract void frenar();

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", añoFab=" + añoFab + "]";
	}
    
    
}

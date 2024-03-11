package edu.ucjc.programacion.bucles;

public class BucleFor {

	public static void main(String[] args) {
		int numero = 0;
		// Primero declarar variable
		// Luego condición para que el bucle se ejecute
		// Último es cómo cambia en cada iteración
		for (int i = 0; i < 5; i++) {
			System.out.println("El valor de i es " + i);
			numero = i;
		}
		System.out.println("Finaliza con " + numero);
	}
}

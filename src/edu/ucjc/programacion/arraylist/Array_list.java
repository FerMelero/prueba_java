package edu.ucjc.programacion.arraylist; // Mantenemos el paquete

import java.util.ArrayList; // Importa la clase correcta

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList lista1 = new ArrayList<>();

		lista1.add("Test"); // Añadimos un elemento de tipo String
		lista1.add("Hola");
		
		for (Object elemento : lista1) {
			System.out.println(elemento);
		}

		System.out.println(lista1);
		lista1.remove(0);

		System.out.println(lista1); // Muestra el contenido de la lista
	}
}

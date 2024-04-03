package edu.ucjc.programacion.bucles;

public class WhileDoWhile {

    public static void main(String[] args) {
    	
    	String nombre = " La programación en java es sencilla ";
		System.out.println(nombre.trim().substring(nombre.lastIndexOf(" ")));
        // While
        /*
        int numero = 10;
        
        while (numero > 7) {
            System.out.println(numero--);
        }
        */

        // Do while, primero ejecuta y luego evalúa la condición

        int numero = 10; // Agregué esta línea para inicializar la variable
        do {
            numero++;
            System.out.println(numero);
        } while (numero < 20);
    }
}

package edu.ucjc.programacion;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 7;
		int numero2 = 10;
		boolean mayorDoce = numero > 12;
		
		if (mayorDoce) {
			System.out.println("Número mayor que 12");
			
		} else if (--numero >= 7 && numero < 12) {
			System.out.println("Número entre 7 y 12");
			
		}else {
			System.out.println("Número menor que 9");
		}
		
		System.out.println(numero);
		System.out.println(numero);
		
		int opcion = 9;
		switch (opcion) {
		case 1 : System.out.println("El valor es 1"); break ;
		case 9 : System.out.println("El valor es 9"); break ;
		default : System.out.println("No es ningún valor controlado"); break ;
		
		}
	}

}

package edu.ucjc.programacion.bucles;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Pares del 0 al 100
		for (int n = 0; n <= 100 ; n+= 2) {
			System.out.println(n);
			
		}
		System.out.println("-----");
		
		
		for (int i = 1, j = 100; j>=0; i+= 2, j-=2) {
			System.out.println(i + "-" + j);
		}
		
		
		System.out.println();
		int x = 3;
		System.out.println(++x);
		System.out.println(x);
		*/
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}

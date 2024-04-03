package edu.ucjc.programacion.poo.composicion.carreracoches;

public class Carrera {

	String nombre;
	String circuito;
	Coche[] parrillaSalida;
	int distancia;

	public Carrera(String nombre, String circuito, Coche[] parrillaSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrillaSalida = parrillaSalida;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public Coche[] getParrillaSalida() {
		return parrillaSalida;
	}

	public void setParrillaSalida(Coche[] parrillaSalida) {
		this.parrillaSalida = parrillaSalida;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void iniciarCarrera() {
		boolean carreraFinalizada = false;

		System.out.println("Bienvenidos al gran premio de " + this.nombre + " en el circuito de " + this.circuito
				+ ". El orden de salida de los pilotos es el siguiente:");

		int n = 1;
		for (Coche coche : parrillaSalida) {
			System.out.println(n + ". " + coche.getPiloto().getNombre());
			n++;
		}

		while (!carreraFinalizada) {
			int[] avances = new int[parrillaSalida.length]; // Almacenar los avances de los coches
			for (int i = 0; i < parrillaSalida.length; i++) {
				Coche coche = parrillaSalida[i];
				coche.correr();
				avances[i] = coche.getAvance();
				System.out.println("Avance del coche " + coche.getEscuderia() + ": " + avances[i]);
			}

			// Verificar si algún coche ha superado la distancia de la carrera
			for (int i = 0; i < avances.length; i++) {
				if (avances[i] >= distancia) {
					System.out.println(
							"El piloto " + parrillaSalida[i].getPiloto().getNombre() + " con el coche de la escudería "
									+ parrillaSalida[i].getEscuderia() + " ha ganado la carrera!");
					carreraFinalizada = true;
					break; // Salir del bucle for
				}
			}

			// Comparar los avances de todos los coches para determinar si alguno ha ganado
			if (!carreraFinalizada) {
				int maxAvance = avances[0];
				for (int i = 1; i < avances.length; i++) {
					if (avances[i] > maxAvance) {
						maxAvance = avances[i];
					}
				}

				// Si un coche ha alcanzado la distancia máxima, la carrera termina
				if (maxAvance >= distancia) {
					carreraFinalizada = true;
					System.out.println("El piloto "
							+ parrillaSalida[getIndexOfMaxAvance(avances)].getPiloto().getNombre()
							+ " con el coche de la escudería "
							+ parrillaSalida[getIndexOfMaxAvance(avances)].getEscuderia() + " ha ganado la carrera!");
				}
			}
		}
	}

	// Método auxiliar para obtener el índice del máximo avance
	private int getIndexOfMaxAvance(int[] avances) {
		int maxIndex = 0;
		for (int i = 1; i < avances.length; i++) {
			if (avances[i] > avances[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}

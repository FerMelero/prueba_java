package edu.ucjc.programacion.poo.herencia.ejs_instrumentos;

public class BandaMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guitarra guitarra1 = new Guitarra("Guitarra1", "Guitarra", 400, "Marca guitarra", 3, "Madera");
		guitarra1.afinar();

		GuitarraElectrica Ge1 = new GuitarraElectrica("Guitarra Electrica 1", "Guitarra Eléctrica", 600, "Marca gue", 4,
				"Madera y metal", 20);
		Ge1.afinar();

		Bateria bateria1 = new Bateria("Batería1", "Batería", 1000, "Marca Batería", 6, 5);

		Piano piano1 = new Piano("Piano1", "Piano", 350, "Marca Piano", 10, 3);

		piano1.afinar();

		Instrumento[] instrumentos = { guitarra1, Ge1, bateria1, piano1 };

		// Llama al método iniciarConcierto
		iniciarConcierto(instrumentos);
	}

	// Mueve el método iniciarConcierto dentro de la clase BandaMusica
	private static void iniciarConcierto(Instrumento[] instrumentos) {
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		System.out.println();
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.tocar();
		}

	}
}

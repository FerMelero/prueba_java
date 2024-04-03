package edu.ucjc.programacion.poo.composicion.carreracoches;

import edu.ucjc.programacion.poo.composicion.coche.Piston;
import edu.ucjc.programacion.poo.composicion.coche.Motor;

public class Circuito {

	public static void main(String[] args) {

		// Crear los pilotos
        Piloto piloto1 = new Piloto("Fernando Alonso", 20, "Alsa Martin", 32);
        Piloto piloto2 = new Piloto("Carlos Sainz", 9, "Ferrari", 2);
        Piloto piloto3 = new Piloto("Verstappen", 9, "RedBull", 56);
        
        // Crear los motores y coches asociados
        Piston piston1 = new Piston(123431, "AM");
        Motor motor1 = new Motor("Mercedes", 600, piston1);
        Coche coche1 = new Coche("Aston Martin", motor1, 14, piloto1, 250, 0);
        
        Piston piston2 = new Piston(7653, "FE");
        Motor motor2 = new Motor("Ferrari", 600, piston2);
        Coche coche2 = new Coche("Ferrari", motor2, 55, piloto2, 260, 0);
        
        Piston piston3 = new Piston(765645, "RB");
        Motor motor3 = new Motor("RedBull", 600, piston3);
        Coche coche3 = new Coche("RedBull", motor3, 1, piloto3, 290, 0);
        
        // Crear la matriz de coches para la parrilla de salida
        Coche[] coches = {coche1, coche2, coche3};
        
        // Crear la carrera con la matriz de coches y otros detalles
        Carrera carrera1 = new Carrera("Italia", "Monza", coches, 1000);
        
        // Iniciar la carrera
        carrera1.iniciarCarrera();
    }

}

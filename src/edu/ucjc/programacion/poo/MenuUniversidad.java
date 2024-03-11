package edu.ucjc.programacion.poo;

import edu.ucjc.programacion.poo.utilidades.Utilidades;

public class MenuUniversidad {
	Alumno[] alumnos = null;

	public static void main(String[] args) {
		int opcion = 0;
		MenuUniversidad menu = new MenuUniversidad();

		do {
			String[] opciones = { "1. Crear universidad", "2. Insertar alumnos", "3. Buscar alumno", "4. Salir" };
			Utilidades.pintarMenu(opciones);

			opcion = Utilidades.pideDatoEntero("Selecciona una opción");
			System.out.println("La opción seleccionada es " + opcion);

			switch (opcion) {
			case 1:
				menu.crearUniversidad();
				break;
			case 2:
				menu.insertarAlumnos();
				break;
			case 3:
				menu.buscarAlumnos();
				break;
			case 4:
				menu.eliminarAlumno();
				break;
				
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 5);
	}

	private void crearUniversidad() {
		int numAlumnos = Utilidades.pideDatoEntero("Introduce el número de alumnos");
		alumnos = new Alumno[numAlumnos];
	}

	private void insertarAlumnos() {

		if (alumnos == null) {
			System.out.println("Debes crear primero la universidad en la opción 1");
		} else {
			for (int i = 0; i < alumnos.length; i++) {
				String dni = Utilidades.pideDatoString("Introduce el DNI del alumno " + (i + 1) + ": ");
				String nombre = Utilidades.pideDatoString("Introduce el nombre del alumno " + (i + 1) + ": ");
				alumnos[i] = new Alumno(nombre, dni);
			}
			System.out.println("Alumnos insertados correctamente.");

		}

	}

	private void buscarAlumnos() {

		if (alumnos == null) {
			System.out.println("Debes crear primero la universidad en la opción 1");
		} else {
			String dni = Utilidades.pideDatoString("Introduce el DNI del alumno: ");

			// Suponiendo que 'alumnos' es el array de objetos Alumno
			for (Alumno a : alumnos) {
				if (a.getDni().equals(dni)) {
					System.out.println("El alumno" + a.getNombre() + "con DNI " + dni + " ha sido encontrado.");
					// Aquí puedes realizar otras operaciones con el alumno encontrado, si es
					// necesario
					break; // Terminamos la búsqueda una vez que se encuentra el alumno
				}
			}

			// Si llegamos aquí, significa que no se encontró el alumno en el array
			System.out.println("El alumno con DNI " + dni + " no ha sido encontrado.");

		}

	}

	private void eliminarAlumno() {
		if (alumnos == null) {
			System.out.println("Debes crear la universidad en la opción 1");
		} else {
			String dniBorrar = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");

			boolean alumnoEncontrado = false;
			for (int i = 0; i < alumnos.length; i++) {
				Alumno alumno = alumnos[i];
				if (alumno != null && alumno.getDni().equals(dniBorrar)) {
					System.out.println("El alumno encontrado, se elimina");
					alumnos[i] = null;
					alumnoEncontrado = true;
					break;
				}
			}

			if (!alumnoEncontrado) {
				System.out.println("El alumno con dni " + dniBorrar + " no está en la Universidad");
			}
		}

	}

}

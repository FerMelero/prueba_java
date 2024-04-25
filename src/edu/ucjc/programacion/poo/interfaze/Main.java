package edu.ucjc.programacion.poo.interfaze;

public class Main {

    public static void main(String[] args) {
        // Crear objetos
        Persona persona1 = new Persona("123A", "Fer");
        Empleado empleado1 = new Empleado("456B", "Marina", 183, 4);
        Ordenador ordenador1 = new Ordenador("HP", "Quantum");

        // Crear un array de objetos que implementan Insertable
        Insertable[] objetos = new Insertable[] { persona1, empleado1, ordenador1 };

        // Llamar al método para insertar todos los objetos
        insertarObjetos(objetos);

        // Llamar al método para fichar solo a empleados
        ficharEmpleados(objetos);
    }

    private static void insertarObjetos(Insertable[] objetos) {
        for (Insertable obj : objetos) {
            obj.insert(); // Llamar al método insert() para cada objeto
        }
    }

    private static void ficharEmpleados(Insertable[] objetos) {
        for (Insertable obj : objetos) {
            if (obj instanceof Empleado) { // Solo empleados pueden fichar
                ((Empleado) obj).fichar();
            }
        }
    }
}

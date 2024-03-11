package edu.ucjc.programacion.poo;

public class PruebaPersonas {
    
    public static void main(String[] args) {
        
        // Creamos objeto de tipo persona
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("111A");
        Persona persona3 = new Persona("111A");
        
        persona1.setNombre("Juan");
        persona1.setApellidos("Pérez"); // Corregido
        persona2.setNombre("Caro");
        
        System.out.println(persona2.getNombre());
        
    }
}

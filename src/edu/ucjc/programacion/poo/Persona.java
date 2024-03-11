package edu.ucjc.programacion.poo;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    public Persona () {
        
    }

    public Persona (String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) { // Corregido
        this.apellidos = apellidos;
    }

    public void correr () {
        if (edad < 18) {
            System.out.println("Corre mucho");
        } else if (edad >= 18 && edad < 40) {
            System.out.println("Corre rápido");
        } else {
            System.out.println("Corre lento");
        }
    }   
    
    
}

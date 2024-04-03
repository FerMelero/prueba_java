package edu.ucjc.programacion.poo.herencia;

public class ClasePadre {
    private String atributo1;
    private int contador;

    public ClasePadre(String atributo1, int contador) {
        this.atributo1 = atributo1;
        this.contador = contador;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void metodo1() {
        System.out.println("Método 1 del padre");
    }
}

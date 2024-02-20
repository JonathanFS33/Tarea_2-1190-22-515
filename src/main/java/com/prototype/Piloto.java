package com.prototype;

/**
 *
 * @author Jonathan
 */
public class Piloto implements ProtoType {
    private String nombre;
    private int aniosExperiencia;
    private int edad;

    public Piloto(String nombre, int aniosExperiencia, int edad) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre = " + nombre + ", aniosExperiencia = " + aniosExperiencia + ", edad = " + edad  + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 
    
    @Override
    public ProtoType crearClon() {
        return new Piloto(nombre, aniosExperiencia, edad);
    }
    
}

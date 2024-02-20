package com.prototype;

/**
 *
 * @author Jonathan
 */
public class Bus implements ProtoType {
    private String tipo;
    private int MaxPasajeros;
    private String marca;
    private double precioPasaje;
    private Piloto piloto;

    public Bus(String tipo, int MaxPasajeros, String marca, double precioPasaje, Piloto piloto) {
        this.tipo = tipo;
        this.MaxPasajeros = MaxPasajeros;
        this.marca = marca;
        this.precioPasaje = precioPasaje;
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Bus{" + "tipo = " + tipo + ", MaxPasajeros = " + MaxPasajeros + ", marca = " + marca + ", precioPasaje = " + precioPasaje + ", piloto = " + piloto + '}';
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaxPasajeros(int MaxPasajeros) {
        this.MaxPasajeros = MaxPasajeros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioPasaje(double precioPasaje) {
        this.precioPasaje = precioPasaje;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    @Override
    public ProtoType crearClon() {
        return new Bus(tipo, MaxPasajeros, marca, precioPasaje, (Piloto)piloto.crearClon());
    }
}

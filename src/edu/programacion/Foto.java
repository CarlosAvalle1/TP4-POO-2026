package edu.programacion;

import java.util.Objects;

public class Foto {
    private String nombre;
    private Double peso;
    private String tipo;

    public Foto(String nombre, Double peso, String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foto otra = (Foto) o;
        return Objects.equals(nombre, otra.nombre)
                && Objects.equals(peso, otra.peso)
                && Objects.equals(tipo, otra.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peso, tipo);
    }

    @Override
    public String toString() {
        return nombre + "." + tipo + " ( " + peso;
    }
}
package edu.programacion;

public class Circulo extends Figura {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getNombre() {
        return "CIRCULO";
    }
}

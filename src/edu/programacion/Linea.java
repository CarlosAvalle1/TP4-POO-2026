package edu.programacion;

public class Linea extends Figura {
    private Double longitud;

    public Linea(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }

    @Override
    public String getNombre() {
        return "LINEA";
    }
}

package edu.programacion;

public abstract class Figura {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Double getArea();

    public abstract String getNombre();

    public void pintar() {
        System.out.println("Pintando " + getNombre() + " " + color);
    }
}

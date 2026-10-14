package edu.programacion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EditorDeFiguras {
    private Collection<Figura> figuras;

    public EditorDeFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        if (figura != null) {
            figuras.add(figura);
        }
    }

    public boolean eliminarFigura(Figura figura) {
        return figuras.remove(figura);
    }

    public void pintar() {
        Iterator<Figura> it = figuras.iterator();
        while (it.hasNext()) {
            it.next().pintar();
        }
    }

    public Double calcularArea() {
        Double total = 0.0;
        Iterator<Figura> it = figuras.iterator();
        while (it.hasNext()) {
            total += it.next().getArea();
        }
        return total;
    }
}
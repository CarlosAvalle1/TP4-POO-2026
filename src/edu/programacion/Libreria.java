package edu.programacion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Libreria {
    private Collection<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro) {
        if (unLibro != null) {
            libros.add(unLibro);
        }
    }

    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    public int cantidadDeLibros() {
        return libros.size();
    }

    public int cantidadTotalDeCopias() {
        int total = 0;
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            total += it.next().getCantidadCopias();
        }
        return total;
    }
}
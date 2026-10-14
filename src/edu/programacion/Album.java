package edu.programacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Album {
    private String nombre;
    private Collection<Foto> fotos;

    public Album(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFoto(Foto foto) {
        if (foto != null) {
            fotos.add(foto);
        }
    }

    public void agregarFotos(Collection<Foto> nuevasFotos) {
        if (nuevasFotos != null) {
            fotos.addAll(nuevasFotos);
        }
    }

    public boolean eliminarFoto(Foto foto) {
        return fotos.remove(foto);
    }

    public void vaciar() {
        fotos.clear();
    }

    public int cantidadFotos() {
        return fotos.size();
    }

    public boolean estaVacio() {
        return fotos.isEmpty();
    }

    public boolean contieneFoto(Foto foto) {
        return fotos.contains(foto);
    }

    public Collection<Foto> getFotos() {
        return Collections.unmodifiableCollection(fotos);
    }

    public void mostrarFotos() {
        System.out.println("Álbum: " + nombre + " (" + cantidadFotos() + " fotos)");
        Iterator<Foto> it = fotos.iterator();
        while (it.hasNext()) {
            System.out.println("  - " + it.next());
        }
    }

    @Override
    public String toString() {
        return "Album{nombre='" + nombre + "', fotos=" + fotos + "}";
    }
}
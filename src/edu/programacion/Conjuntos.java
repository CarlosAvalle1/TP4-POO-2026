package edu.programacion;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    private Set<Persona> personas;

    public Conjuntos() {
        this.personas = new HashSet<>();
    }

    public void add(Persona persona) {
        personas.add(persona);
    }

    public void remove(Persona persona) {
        personas.remove(persona);
    }

    public Conjuntos union(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.addAll(set.personas);
        return resultado;
    }

    public Conjuntos interseccion(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.retainAll(set.personas);
        return resultado;
    }

    public Conjuntos diferencia(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();
        resultado.personas.addAll(this.personas);
        resultado.personas.removeAll(set.personas);
        return resultado;
    }

    public Conjuntos diferenciaSimetrica(Conjuntos set) {
        Conjuntos union = this.union(set);
        Conjuntos interseccion = this.interseccion(set);
        return union.diferencia(interseccion);
    }

    @Override
    public String toString() {
        return personas.toString();
    }
}
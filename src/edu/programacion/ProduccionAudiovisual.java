package edu.programacion;
import java.util.ArrayList;
import java.util.List;

public abstract class ProduccionAudiovisual {
    private String titulo;
    private Integer anio;
    private List<Actor> actores;
    private List<Director> directores;
    private List<Personaje> personajes;

    public ProduccionAudiovisual(String titulo, Integer anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.actores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.personajes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void agregarDirector(Director director) {
        directores.add(director);
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}
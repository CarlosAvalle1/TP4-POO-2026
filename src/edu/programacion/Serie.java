package edu.programacion;
import java.util.ArrayList;
import java.util.List;

public class Serie extends ProduccionAudiovisual {
    private List<Capitulo> capitulos;

    public Serie(String titulo, Integer anio) {
        super(titulo, anio);
        this.capitulos = new ArrayList<>();
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public int cantidadDeCapitulos() {
        return capitulos.size();
    }
}

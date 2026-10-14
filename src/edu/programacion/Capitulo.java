package edu.programacion;

public class Capitulo {
    private Integer numero;
    private String titulo;

    public Capitulo(Integer numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

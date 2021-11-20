package org.josue;

import java.io.*;

public class Fichero {
    private String id;
    private String nombre;
    private Fecha fechaCrea;
    private File fichero;
    private long tamaño;

    private static int contador = 0;

    public Fichero(String nombre) {

        this.nombre=nombre;
    }

    private static int getContador() {
        return contador++;
    }

    public String getId() {
        return this.id="" + getContador();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaCrea() {
        return this.fechaCrea;
    }

    public File getFichero() {
        return this.fichero;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " # " + tamaño;
    }
}

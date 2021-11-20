package org.josue;

public interface Servidor_Principal {
    public String subir(String nomFich);

    public String listado();

    public Fichero bajar(String id);
}

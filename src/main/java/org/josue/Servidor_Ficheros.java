package org.josue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Servidor_Ficheros implements Servidor_Principal {
    private String nombre;
    private HashMap<String, Fichero> ficheros;
    private Fichero fichero;
    public Servidor_Ficheros(String nombre) {
        this.nombre = nombre;
        ficheros = new HashMap<String, Fichero>();
    }
    public String subir(String nombreFichero) {
        fichero = new Fichero(nombreFichero);
        ficheros.put(fichero.getId(), fichero);
        return "\nFichero subido correctamente!";
    }
    public Fichero bajar(String id) {
        return ficheros.get(id);
    }
    public String listado() {
        String lista = "\nListado de ficheros en el servidor: " + this.nombre + " ###";
        Collection c = ficheros.values();
        Iterator i = c.iterator();
        while (i.hasNext()) {
            fichero = (Fichero) i.next();
            lista += "\n\t" + fichero.toString();
        }
        return lista;
    }
}


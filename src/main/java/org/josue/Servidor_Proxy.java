package org.josue;

public class Servidor_Proxy implements Servidor_Principal{
    private Servidor_Principal servPrincipal;

    public Servidor_Proxy(Servidor_Principal servPrincipal) {
        this.servPrincipal = servPrincipal;
    }
    public void setServidor(Servidor_Principal servPrincipal) {
        this.servPrincipal= servPrincipal;
    }
    public Servidor_Principal getServidor() {
        return servPrincipal;
    }
    public String subir(String nomFich) {
        return "\nSubiendo desde el proxy..." + servPrincipal.subir(nomFich);
    }
    public Fichero bajar(String id) {
        return servPrincipal.bajar(id);
    }
    public String listado() {
        return "\nListando desde el proxy..." + servPrincipal.listado();
    }
}
